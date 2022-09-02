package Suporte;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;

import Banco.Agencia.Agencia;
import Banco.Agencia.Contas.Conta;
import Banco.Agencia.Contas.Corrente;
import Banco.Agencia.Contas.Poupanca;
import Banco.Agencia.Contas.Salario;
import Banco.Agencia.Contas.Movimentcaoes.Movimentacoes;
import Banco.Agencia.Funcionarios.Funcionario;
import Banco.Agencia.Funcionarios.Gerente;
import Banco.Clientes.Clientes;


public class GerenArquivos {


    private static final String BaseDados ="C:\\Users\\israe\\Meu Drive\\Trello\\Estudos Dev\\POO\\Trabalho Poo\\TrabalhoFinalPOO1\\src\\Dados\\";


    // ------------------------------------------------------   //
    // ------------------------------------------------------   //
    //              ARQUIVO PARA CLIENTES                 //
    // ------------------------------------------------------   //
    // ------------------------------------------------------   //

    public static void SalvarArquivoClientes (LinkedList<Clientes> clientes)
    {
        try {
            FileWriter arq = new FileWriter ( BaseDados+"Clientes.csv" );
            PrintWriter out = new PrintWriter (arq);
            try{
                for (int i = 0; i < clientes.size() ; i++) {
                String linha = clientes.get(i).SaidaArquivo();
                out.println( linha );
                }
            }
            catch(NullPointerException e)
            {
                System.out.println("Não possui nenhum registro");
            }
            out.close ();
        } 
        catch ( IOException erro )
        {
        System .out. println (" Erro na escrita dos dados Clientes");
        }
    }

    public static LinkedList<Clientes> CarregarClientes () 
    {   
        LinkedList<Clientes> Clientes = new LinkedList<>();
        try {
    
            FileReader ent = new FileReader ( BaseDados+"Clientes.csv" );
            BufferedReader br = new BufferedReader (ent);
            String linha ;
            String [] campos = null ;
            while (( linha = br. readLine ()) != null )
            {
                campos = linha.split(";");
                Data DataNasc = new Data(Integer.parseInt(campos[2]), Integer.parseInt(campos[3]), Integer.parseInt(campos[4]));
                Endereco EndCliente = new Endereco(campos[5], Integer.parseInt(campos[6]), campos[7], campos[8], campos[9], campos[10], campos[11], Integer.parseInt(campos[12]));
                Clientes.add(new Clientes(campos[0], campos[1], DataNasc, EndCliente, campos[13], campos[14], campos[15]));
            
                
            }
            br.close();
        } 
        catch ( IOException erro )
        {
        System .out. println (" Erro na escrita dos dados Clintes");
        }
        return Clientes;
    } 

    // ------------------------------------------------------   //
    // ------------------------------------------------------   //
    //              ARQUIVO PARA CONTA                          //
    // ------------------------------------------------------   //
    // ------------------------------------------------------   //

    public static LinkedList<Conta> Carregar_contas(int NumAgencia, LinkedList<Clientes> Clientes)
        {
            String NumeroAgencia = String.valueOf(NumAgencia);
            LinkedList<Conta> contas = new LinkedList<>();
            try {
    
                FileReader ent = new FileReader ( BaseDados+"\\Contas\\"+NumeroAgencia+"Contas.csv" );
                try (BufferedReader br = new BufferedReader (ent)) {
                    String linha ;
                    String [] campos = null ;
                    while (( linha = br. readLine ()) != null ) 
                    {
                        campos = linha.split(";");
                        Data AberturaConta = new Data(Integer.parseInt(campos[9]),Integer.parseInt(campos[10]),Integer.parseInt(campos[11]));
                        Data UltimaMovimentacao = new Data(Integer.parseInt(campos[12]),Integer.parseInt(campos[13]),Integer.parseInt(campos[14]));
                        Clientes Primario = new Clientes();
                        Clientes Secundario = new Clientes();
                        boolean CPF_Encontrado = false;

                        for(int i =0 ; i < Clientes.size(); i++)
                        {
                            Clientes Percorre  = Clientes.get(i);
                            if(Percorre.getCPF().equals(campos[6]))
                            {   
                                Primario = Percorre;
                                CPF_Encontrado = true;
                            }
                            else if(Percorre.getCPF().equals(campos[7]))
                            {
                                Secundario = Percorre;
                            }
                            
                        }

                        if (!CPF_Encontrado)
                                throw new IllegalArgumentException("Cliente não encontrado");

                        Conta Nova;
                        switch(campos[0])
                        {
                            case "Corrente":
                                 Nova = new Corrente(Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), Float.parseFloat(campos[3]), Boolean.parseBoolean(campos[5]), Primario,Integer.parseInt(campos[8]), AberturaConta, Float.parseFloat(campos[15]), Float.parseFloat(campos[16]));
                                if(Boolean.parseBoolean(campos[5]))
                                {
                                    Nova.setCliente_secundario(Secundario);
                                }
                                Nova.setUltima_Movimentacao(UltimaMovimentacao);
                                contas.add(Nova);
                                break;
                            case "Poupanca":
                                 Nova = new Poupanca(Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), Float.parseFloat(campos[3]), Boolean.parseBoolean(campos[5]), Primario,Integer.parseInt(campos[8]), AberturaConta, Float.parseFloat(campos[15])); 
                                if(Boolean.parseBoolean(campos[5]))
                                {
                                    Nova.setCliente_secundario(Secundario);
                                }
                                Nova.setUltima_Movimentacao(UltimaMovimentacao);
                                contas.add(Nova);
                                break;
                            case "Salario":
                                 Nova = new Salario(Integer.parseInt(campos[1]), Integer.parseInt(campos[2]), Float.parseFloat(campos[3]), Boolean.parseBoolean(campos[5]), Primario,Integer.parseInt(campos[8]), AberturaConta, Float.parseFloat(campos[15]), Float.parseFloat(campos[16]));
                            if(Boolean.parseBoolean(campos[5]))
                                {
                                    Nova.setCliente_secundario(Secundario);
                                }
                                Nova.setUltima_Movimentacao(UltimaMovimentacao);
                                contas.add(Nova);
                                break;
                            default:
                                break;
                            
                        }
                    }   
                    br. close ();
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
            catch ( IOException erro ) 
            {
                System .out. println (" Arquivo nao encontrado ou corrompido:"+NumeroAgencia+"Contas.csv");
            }
            return contas;
        }

    public static void SalvarArquivoContas (int Num_Agencia, LinkedList<Conta> contas) 
        {
            String NumAgencia = String.valueOf(Num_Agencia);
            try {
                FileWriter arq = new FileWriter ( BaseDados+"\\Contas\\"+NumAgencia+"Contas.csv" );
                PrintWriter out = new PrintWriter (arq);
                try{
                    for (int i = 0; i < contas.size() ; i++) {
                    String linha = contas.get(i).SaidaArquivo();
                    out.println( linha );
                    }
                }
                catch(NullPointerException e)
                {
                    System.out.println("  Null Point");
                }
                out.close ();
            } 
            catch ( IOException erro )
            {
            System .out. println (" Erro na escrita dos dados Contas");
            }
        }

    // ------------------------------------------------------   //
    // ------------------------------------------------------   //
    //              ARQUIVO PARA AGENCIAS                       //
    // ------------------------------------------------------   //
    // ------------------------------------------------------   //
      
    public static LinkedList<Agencia> Carregar_Agencias()
        {
            LinkedList<Agencia> Agencia = new LinkedList<>();
            try {
    
                FileReader ent = new FileReader ( BaseDados+"Agencias.csv" );
                BufferedReader br = new BufferedReader (ent);
                String linha ;
                String [] campos = null ;
                while (( linha = br. readLine ()) != null ) 
                {
                    campos = linha.split(";");
                    Agencia Nova = new Agencia(campos[0], Integer.parseInt(campos[1]));
                    Endereco End = new Endereco(campos[2], Integer.parseInt(campos[3]), campos[4], campos[5], campos[6], campos[7], campos[8], Integer.parseInt(campos[9]));
                    Nova.setEndereco_agencia(End);
                    Agencia.add(Nova);
                }   
                br. close ();
            }
            catch ( IOException erro ) 
            {
                System .out. println ("Arquivo nao encontrado ou corrompido: Agencias.csv");
            }
            return Agencia;
        }

    public static void SalvarArquivoAgencia (LinkedList<Agencia> Agencia) 
        {

            try {
                FileWriter arq = new FileWriter ( BaseDados+"Agencias.csv" );
                PrintWriter out = new PrintWriter (arq);
                try{
                    for (int i = 0; i < Agencia.size() ; i++) {
                   
                    String linha = Agencia.get(i).DadosAgencia();
                    out.println( linha );
                    }
                }
                catch(NullPointerException e)
                {
                }
                out.close ();
            } 
            catch ( IOException erro )
            {
            System .out. println (" Erro na escrita dos dados Agencias");
            }
            
        }
    
    //////////////////////////////////////////////////////////////
    ///
    ///            ARQUIIVO DE FUNCIONARIOS                     //
    ///
    //////////////////////////////////////////////////////////////

    public static LinkedList<Pessoa> Carregar_Funcioanrios(int NumAgencia)
        {
            LinkedList<Pessoa> Funcionarios = new LinkedList<>();
            String NumeroAgencia = String.valueOf(NumAgencia);
            try
            {
    
                FileReader ent = new FileReader ( BaseDados+"\\Funcionarios\\"+NumeroAgencia+"Funcionarios.csv" );
                BufferedReader br = new BufferedReader (ent);
                String linha ;
                String [] campos = null ;
                while (( linha = br. readLine ()) != null ) 
                {
                    campos = linha.split(";");
                    Data[] Datas = new Data[3];
                    Datas[0] = new Data(Integer.parseInt(campos[2]), Integer.parseInt(campos[3]), Integer.parseInt(campos[4]));
                    Datas[1] = new Data(Integer.parseInt(campos[18]), Integer.parseInt(campos[19]), Integer.parseInt(campos[20]));
                    Endereco End = new Endereco(campos[5], Integer.parseInt(campos[6]), campos[7], campos[8], campos[9], campos[10], campos[11], Integer.parseInt(campos[12]));
                    if(campos[16].equals("Gerente"))
                    {
                        Datas[2] = new Data(Integer.parseInt(campos[26]), Integer.parseInt(campos[27]), Integer.parseInt(campos[28]));

                        Funcionario Novo = new Gerente(campos[0], campos[1], Datas[0], End, campos[13], campos[14], Integer.parseInt(campos[15]), Float.parseFloat(campos[17]),  Datas[1], Integer.parseInt(campos[21]), campos[22], Boolean.parseBoolean(campos[23]),  Datas[2]);
                        Funcionarios.add(Novo);
                    }
                    else 
                    {
                        Funcionario Novo = new Funcionario(campos[0], campos[1], Datas[0], End, campos[13], campos[14], Integer.parseInt(campos[15]),campos[16], Float.parseFloat(campos[17]),  Datas[1], Integer.parseInt(campos[21]), campos[22]);
                        Funcionarios.add(Novo);
                    }   
                }
                br. close ();
            }
            catch ( IOException erro ) 
            {
                System .out. println (" Arquivo nao encontrado ou corrompido: Funcionarios.csv");
            }
            return Funcionarios;
        }

    public static void SalvarArquivoFuncionarios (int Num_Agencia, LinkedList<Pessoa> funcionarios) 
        {
            String NumAgencia = String.valueOf(Num_Agencia);
            try {
                FileWriter arq = new FileWriter ( BaseDados+"\\Funcionarios\\"+NumAgencia+"Funcionarios.csv" );
                PrintWriter out = new PrintWriter (arq);
                try{
                    for (int i = 0; i < funcionarios.size() ; i++) {
                    Funcionario Percorre = (Funcionario) funcionarios.get(i);
                    String linha;

                    if(Percorre.getCargo_na_empresa().equals("Gerente"))
                        linha = Percorre.DadosGerente();
                    else linha = Percorre.DadosFuncionario();
                    out.println( linha );
                    }
                }
                catch(NullPointerException e)
                {
                }
                out.close ();
            } 
            catch ( IOException erro )
            {
            System .out. println (" Erro na escrita dos dados Funcioanrios ");
            }
        }

    //////////////////////////////////////////////////////////////
    ///
    ///            ARQUIIVO DE MOVIMENTACOES                    //
    ///
    //////////////////////////////////////////////////////////////   
  
    public static LinkedList<Movimentacoes> carregar_Movimentacoes(int Num_Conta, int Num_Agencia)
        {
            String NumAgencia = String.valueOf(Num_Agencia);
            String NumConta = String.valueOf(Num_Conta);
            LinkedList<Movimentacoes> Movimentacoes = new LinkedList<>();
            try {
    
                FileReader ent = new FileReader ( BaseDados+"\\Contas\\Movimentacoes\\"+NumAgencia+NumConta+"Movimentacoes.csv");
                BufferedReader br = new BufferedReader (ent);
                String linha ;
                String [] campos = null ;
                while (( linha = br. readLine ()) != null ) 
                {
                    campos = linha.split(";");
                    Data Nova = new Data(Integer.parseInt(campos[0]), Integer.parseInt(campos[1]),Integer.parseInt(campos[2]));
                    Movimentacoes Mov = new Movimentacoes(Nova, Float.parseFloat(campos[3]), campos[4], Integer.parseInt(campos[5]), Integer.parseInt(campos[6]), Integer.parseInt(campos[7]), campos[8]);
                    Movimentacoes.add(Mov);
                }   
                br. close ();
            }
            catch ( IOException erro ) 
            {
                System .out. println ("Arquivo nao encontrado ou corrompido:"+NumAgencia+NumConta+"Movimentacoes.csv");
            }
            return Movimentacoes;
        }

    public static void SalvarArquivoMovimentacoes(int Num_Agencia,int Num_Conta, LinkedList<Movimentacoes> movimentacoes) 
    {
        String NumAgencia = String.valueOf(Num_Agencia);
        String NumConta = String.valueOf(Num_Conta);
        try {
            FileWriter arq = new FileWriter ( BaseDados+"\\Contas\\Movimentacoes\\"+NumAgencia+NumConta+"Movimentacoes.csv" );
            PrintWriter out = new PrintWriter (arq);
            try{
                for (int i = 0; i < movimentacoes.size() ; i++) {
                String linha = movimentacoes.get(i).DadosMovimentacao();
                out.println( linha );
                }
            }
            catch(NullPointerException e)
            {
            }
            out.close ();
        } 
        catch ( IOException erro )
        {
        System .out. println (" Erro na escrita dos dados"+NumAgencia+NumConta+"Movimentacoes.csv");
        }
    }

}
