package Banco;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import Banco.Agencia.Agencia;
import Banco.Agencia.Contas.Conta;
import Banco.Agencia.Contas.Corrente;
import Banco.Agencia.Contas.Poupanca;
import Banco.Agencia.Contas.Salario;
import Banco.Agencia.Funcionarios.Funcionario;
import Banco.Agencia.Funcionarios.Gerente;
import Banco.Clientes.Clientes;
import Suporte.Data;
import Suporte.Endereco;
import Suporte.GerenArquivos;
import Suporte.Pessoa;
import Suporte.ValidaCPF;

public class Banco {

    private LinkedList<Agencia> Agencias; 
    private LinkedList<Clientes> Clientes;
    private String[] Admin = {"Admin","admin"}; //Usuario e Senha Administrador
    

    public Banco() {
        this.Agencias =  new LinkedList<>();
        this.Clientes = new LinkedList<>();
    }

/////////////////////////////////////////////////////////////////////////
///
///                 Getters e Setters                                ///
///
////////////////////////////////////////////////////////////////////////

    public LinkedList<Agencia> getAgencias() {
        return this.Agencias;
    }

    public void setAgencias(LinkedList<Agencia> Agencias) {
        this.Agencias = Agencias;
    }

    public LinkedList<Clientes> getClientes() {
        return this.Clientes;
    }

    public void setClientes(LinkedList<Clientes> Clientes) {
        this.Clientes = Clientes;
    }

    public boolean LoginAdministrador(String Usuario, String Senha)
    {
        if(this.Admin[0].equals(Usuario) && this.Admin[1].equals(Senha))
            return true;
        else return false;
    }

 //////////////////////////////////////////////////////////////////////////////
 //                                                                         ///
 //               Funcionarios                                              ///
 //                                                                         ///
 //////////////////////////////////////////////////////////////////////////////

    public void Area_do_Funcionario(Scanner scan)
    {
        int opcao =1;
        while(opcao!=0)
        {
            System.out.println();
            System.out.println("01 Entrar no sistema");
            System.out.println("02 Cadastrar Funcionario ");
            System.out.println("03 Promover a Gerente ");
            System.out.println("04 Cadastrar uma Nova Agencia");
            System.out.println("05 Lista de Funcionarios");
            System.out.println("06 Lista de Clientes");
            System.out.println("07 Lista de Contas");
            System.out.println("08 Lista de Agencias");
            System.out.println("00 Voltar ao menu anterior ");

            try{
                opcao=scan.nextInt();
                scan.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Digite um numero de 0 a 3");
            }

            switch(opcao)
            {
                case 0:
                    break;
                case 1:
                    Acesso_Funcionario(scan);
                    opcao=0;
                    break;
                case 2: 
                    Cadastrar_funcionario(scan);
                    opcao=0;
                    break;
                case 3:
                    Promover_A_Gerente(scan);
                    opcao=0;
                    break;
                case 4:
                    Cadastrar_Agencia(scan);
                    System.out.println("A nova Agencia Precisa de um Gerente");
                    GerenArquivos.SalvarArquivoAgencia(Agencias);
                    Agencias=GerenArquivos.Carregar_Agencias();
                    opcao=0;
                    break;
                case 5: 
                    Encontrar_Funcionario();
                    opcao=1;
                    break;
                case 6:
                    ListaClientes();
                    opcao=1;
                    break;
                case 7:
                    ListaContas();
                    opcao=1;
                    break;
                case 8:
                    Encontrar_Agencias_Proximas();
                    opcao=1;
                    break;
                default:
                    System.out.println("Opcao Invalida");    

            }
        }
    }
 
    private void Acesso_Funcionario(Scanner scan)
    {
       System.out.println("Area em Manutencao voltei mais tarde");
    }

    public Pessoa Encontrar_Funcionario(Scanner scan) throws  IllegalArgumentException
    {
        try{
            int h = 1;
            for(int i =0 ; i<Agencias.size(); i++)
            {
            System.out.print((i+1)+" - ");
            Agencias.get(i).ImprimeNome_e_Localizacao();
            }
            
            System.out.println("Qual Agencia");
            int h2= scan.nextInt()-1;
            
            Agencias.get(h2).Encontra_Funcioanrio(1);
            System.out.println("Qual Funcionario");
            h = scan.nextInt()-1;
            
            if(h<=Agencias.get(h2).getFuncionarios().size() && h2<=Agencias.size())
            {
                return Agencias.get(h2).getFuncionarios().get(h);
            }
        }catch(IndexOutOfBoundsException e)
        {
            System.out.println("Opcao Invalida!");
        }catch(InputMismatchException e)
        {
            System.out.println("Valor invalido, digite um numeral");
        }
        throw new IllegalArgumentException("Funcionario não encontrado");


    }

    private void Cadastrar_funcionario(Scanner scan) // Funcionando e Testada.
    {
        Encontrar_Agencias_Proximas();

        int index = scan.nextInt()-1;
        scan.nextLine();

        System.out.printf("Nome Funcionairo: ");
        String Nome= scan.nextLine();
        
        System.out.printf("CPF: ");
        String CPF =scan.nextLine();

        if(!ValidaCPF.isCPF(CPF))
        {
            throw new IllegalArgumentException("CPF não e valido");
        }
        
        System.out.printf("Genero: ");
        String Sexo = scan.nextLine();
        
        System.out.printf("Estado Civil: ");
        String Estado_Civil = scan.nextLine();

        System.out.printf("Cargo: ");
        String Cargo_na_empresa = scan.nextLine(); 

        System.out.printf("Endereco\nPais: ");
        String End_Pais = scan.nextLine();

        System.out.printf("Estado: ");
        String End_Estado = scan.nextLine();

        System.out.printf("Cidade: ");
        String End_Cidade = scan.nextLine();

        System.out.printf("Bairro: ");
        String End_Bairro = scan.nextLine();

        System.out.printf("Rua: ");
        String End_Rua = scan.nextLine();

        System.out.printf("Complamento: ");
        String End_Complemento = scan.nextLine();
        
        System.out.printf("Numero: ");        
        int End_Num = scan.nextInt();

        System.out.printf("CEP: ");
        int End_Cep = scan.nextInt();
        scan.nextLine();

        System.out.printf("RG UF Letras: ");
        String RG_UF = scan.nextLine();
        
        System.out.printf("RG Numeros: ");
        int RG_Num = scan.nextInt(); 

        Data Data_de_Ingresso = Data.DataAtual();

        
        System.out.printf("Data Nascimento\nDia: ");
        int dia = scan.nextInt();

        System.out.printf("Mes: ");
        int mes = scan.nextInt();

        System.out.printf("Ano: ");
        int ano = scan.nextInt();

        Data Data_de_Nascimento = new Data(dia, mes, ano); 

        System.out.printf("Salario: ");
        float salario = scan.nextFloat();

        System.out.printf("Numero da Carteira: ");
        int Numero_Carteira_de_trabalho = scan.nextInt();
        Endereco endereco = new Endereco(End_Rua, End_Num, End_Bairro, End_Cidade, End_Estado, End_Pais, End_Complemento, End_Cep);

        Funcionario Novo = new Funcionario(Nome, CPF, Data_de_Nascimento, endereco, Sexo, Estado_Civil, Numero_Carteira_de_trabalho, Cargo_na_empresa, salario, Data_de_Ingresso, RG_Num, RG_UF);
        
        Agencias.get(index).getFuncionarios().add(Novo);
        
        Agencias.get(index).SalvarArquivo();
    }

    private void Promover_A_Gerente(Scanner scan)
    {
        System.out.println("Escolha um funcionario");
        try{
            Funcionario FuncionarioAtual = (Funcionario) Encontrar_Funcionario(scan);
            System.out.printf("Possui Formacao Basica em Gerencia? \n01 -> Sim \n02 ou Numero maior -> Nao\n");
            int temp = scan.nextInt();
            
            boolean Formacao_Basica_EmGerencia;
            if(temp == 1 )
            Formacao_Basica_EmGerencia = true;
            else Formacao_Basica_EmGerencia = false;
            
            Data Data_Ingresso_Como_Gerente = Data.DataAtual();
            
            String linha = FuncionarioAtual.DadosFuncionario() ;
            String [] campos = linha.split(";");
            
            Data DataNascimento = new Data(Integer.parseInt(campos[2]),Integer.parseInt(campos[3]), Integer.parseInt(campos[4]));
            
            Data Ingresso = new Data(Integer.parseInt(campos[18]), Integer.parseInt(campos[19]), Integer.parseInt(campos[20]));
            
            Endereco End = new Endereco(campos[5], Integer.parseInt(campos[6]), campos[7], campos[8], campos[9], campos[10], campos[11], Integer.parseInt(campos[12]));
            
            Gerente Novo = new Gerente(campos[0],
            campos[1],
            
            DataNascimento, 
            End, campos[13],
            campos[14], Integer.parseInt(campos[15]),Float.parseFloat(campos[17]),
            Ingresso, Integer.parseInt(campos[21]), campos[22], Formacao_Basica_EmGerencia, Data_Ingresso_Como_Gerente);
            
            for(int i = 0 ; i< Agencias.size();i++)
            {
                if(Agencias.get(i).isFuncionario_dessa_Agencia(FuncionarioAtual))
                {
                    Agencias.get(i).setGerente(Novo, FuncionarioAtual);
                }
            }
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }catch(InputMismatchException e)
        {
            System.out.println(e.getSuppressed());
        }       
    }
    
    
    public void Encontrar_Funcionario(int pos)
    {
        System.out.println("N -> Nome, CPF");
        for(int i =0 ; i<Agencias.size(); i++)
        {
            Agencias.get(i).ImprimeNome_e_Localizacao();
            pos = Agencias.get(i).Encontra_Funcioanrio(pos);
        } 
    }
    
    public void Encontrar_Funcionario()
    {
        
        System.out.println("N -> Nome, CPF");
        for(int i =0 ; i<Agencias.size(); i++)
        {
            int pos =1;
            Agencias.get(i).ImprimeNome_e_Localizacao();
            pos = Agencias.get(i).Encontra_Funcioanrio(pos);
        } 
    }
    
 //////////////////////////////////////////////////////////////////////////////
 ///
 ///                Agencias                                                ///
 ///
 //////////////////////////////////////////////////////////////////////////////

    public void Encontrar_Agencias_Proximas(Scanner Scan)
    {
        int opcao = 1;
        String Estado;
        String Cidade;
        String Bairro;

        while(opcao!=0)
        {
            System.out.println("Deseja buscar por: ");
            System.out.println("01 Estado");
            System.out.println("02 Cidade e Estado");
            System.out.println("03 Bairro, Cidade e Estado");
            System.out.println("04 Mostrar todas");
            System.out.println("00 Voltar ao menu anterior");
            try
            {
                opcao= Scan.nextInt();
                Scan.nextLine();
            }
            catch(InputMismatchException e)
            {
                System.out.println("Digite um numero de 0 a 3");
                break;
            }
            switch(opcao)
            {
                case 0:
                    break;
                case 1: 
                    System.out.println("Qual o Estado?");
                    Estado = Scan.nextLine();
                    Encontrar_Agencias_Proximas(Estado);
                    opcao=0;
                    break;
                case 2: 
                    System.out.println("Qual o Estado?");
                    Estado = Scan.nextLine();
                    System.out.println("Qual a Cidade?");
                    Cidade = Scan.nextLine();
                    Encontrar_Agencias_Proximas(Cidade,Estado);
                    opcao=0;
                    break;
                case 3: 
                    System.out.println("Qual o Estado?");
                    Estado = Scan.nextLine();
                    System.out.println("Qual a Cidade?");
                    Cidade = Scan.nextLine();
                    System.out.println("Qual Bairro?");
                    Bairro=Scan.nextLine();
                    Encontrar_Agencias_Proximas(Bairro,Cidade,Estado);
                    opcao=0;
                    break;
                case 4:
                    Encontrar_Agencias_Proximas();
                    opcao=0;
                    break;
                default:
                    System.out.println("Opcao Invalida, tente novamente");
                    break;
                
            }
        }
            

    }

    private void Encontrar_Agencias_Proximas(String Bairro, String Cidade, String Estado)
    {
        for(int i= 0; i< Agencias.size();i++)
        {
            Agencias.get(i).LocalizaAgencia(Bairro, Cidade, Estado);;
        }
    }
  
    private void Encontrar_Agencias_Proximas(String Cidade, String Estado)
    {
        for(int i= 0; i< Agencias.size();i++)
        {
            Agencias.get(i).LocalizaAgencia(Cidade, Estado);
        }
    }
   
    private void Encontrar_Agencias_Proximas(String Estado)
    {
        for(int i= 0; i< Agencias.size();i++)
        {
            Agencias.get(i).LocalizaAgencia(Estado);
        }
    }
    
    public  void Encontrar_Agencias_Proximas()
    {
        for(int i =0 ;i<Agencias.size();i++)
        {
            System.out.print((i+1) + " -> ");
            Agencias.get(i).ImprimeNome_e_Localizacao();
        }
    }

    private void Cadastrar_Agencia(Scanner scan) // Funcionando e Testada
    {
        System.out.println("Permitido Acesso apenas a Administradores");
        System.out.print("Usuario: ");
        String Usuario = scan.nextLine();
        System.out.print("Senha: ");
        String Senha = scan.nextLine();
        
        boolean AcessoAdmim = LoginAdministrador(Usuario, Senha);

        if(!AcessoAdmim)
            return;
        
        System.out.print("Nome da Agencia: ");
        String NomeAgencia = scan.nextLine();

        Agencia Nova = new Agencia(NomeAgencia, (Agencias.size()+100));
        System.out.print("Fica em qual Pais: ");
        String Pais = scan.nextLine();
        System.out.print("Estado: ");
        String Estado = scan.nextLine();
        System.out.printf("Cidade: ");
        String Cidade = scan.nextLine();
        System.out.printf("Bairro: ");
        String Bairro = scan.nextLine();
        System.out.printf("Rua: ");
        String Rua = scan.nextLine();
        System.out.printf("Complemento: ");
        String Complemento = scan.nextLine();
        System.out.printf("Numero: ");
        int Num = scan.nextInt();
        System.out.printf("CEP: ");
        int cep = scan.nextInt();
        scan.nextLine();

        Nova.setEndereco_agencia(new Endereco(Rua, Num, Bairro, Cidade, Estado, Pais, Complemento,cep));

        System.out.println("Nova Agencia dos Cria Cadastrada, Mandem seus curriculos! ");
        Agencias.add(Nova);

        GerenArquivos.SalvarArquivoAgencia(Agencias);
    }

    public int indiceAgencia(Scanner scan) // informa as agencias disponiveis e retorna a escolhar;
    {
        int NumAgencia =0;
        
            while(true) // Encontrar o indice da Agencia;
            {
                System.out.println("Digite a agência que deseja: ");
                Encontrar_Agencias_Proximas();
                
                NumAgencia = scan.nextInt()-1;
                if(NumAgencia>-1 && NumAgencia < Agencias.size())
                {        
                    break;   
                } 
                else
                    System.out.println("Opção indisponivel, tente novamente");          
            }
        return NumAgencia;
    }

    public int EncontraNumAgencia(Scanner scan)
    {
        int NumAgencia = indiceAgencia(scan) +99;
        return NumAgencia;
    }

    public int IndiceAgencia(int NumeroAgencia)
    {
        for(int i = 0 ; i< Agencias.size(); i++)
        {
            if(Agencias.get(i).getNum_Agencia()==NumeroAgencia)
            {
                return i;
            }
        }
        return -10;
    }

 //////////////////////////////////////////////////////////////////////////////
 ///
 ///                Clientes                                                ///
 ///
 //////////////////////////////////////////////////////////////////////////////

    public void Cadastrar_Cliente(Scanner scan, String cpf)
    {
        
        int opcao =3;
        while(opcao!=0)
        {
            try
            {
                System.out.println("Vamos fazer seu cadastro meu cria");
                if(cpf.equals("0"))
                {
                    System.out.print("Digite seu CPF222: ");
                    cpf = scan.nextLine();
                }
                boolean cpfvalido = ValidaCPF.isCPF(cpf);

                if(!cpfvalido)
                    {
                        opcao--;
                        System.out.println("Cpf invalido, voce tem mais " + opcao + " Tentativas");
                    }
                else
                {
                    Pessoa Cliente_Novo = new Clientes();
                    //buscar nos clientes se possui algum ja cadastrado com esse cpf
                    for(int i = 0; i<Clientes.size();i++)
                    {
                        if(Clientes.get(i).getCPF().equals(cpf))
                        {
                            
                            return;
                        }
                    }

                    // caso cpf ainda não cadastrado

                        System.out.print("Digite seu nome completo: ");
                        Cliente_Novo.setNome(scan.nextLine());
                        System.out.print("Voce e de qual Genero? ");
                        Cliente_Novo.setSexo(scan.nextLine());
                        System.out.print("Qual seu estado civil? ");
                        Cliente_Novo.setEstado_Civil(scan.nextLine());
                        System.out.print("Preciso do seu endereço começando pela rua: ");
                        String Rua = scan.nextLine();
                        System.out.print("Bairro: ");
                        String Bairro = scan.nextLine();
                        System.out.print("Cidade: ");
                        String Cidade = scan.nextLine();
                        System.out.print("Estado: ");
                        String Estado = scan.nextLine();
                        System.out.print("Pais: ");
                        String Pais = scan.nextLine();
                        System.out.print("Complemento: ");
                        String End_Complemento = scan.nextLine();
                        System.out.print("Numero: ");
                        int numero = scan.nextInt();
                        System.out.print("CEP: ");
                        int CEP = scan.nextInt();
                        System.out.print("Qual sua data de Nascimento?\nDia: ");
                        int dia_nascimento = scan.nextInt();
                        System.out.print("Mes:  ");
                        int mes = scan.nextInt();
                        System.out.print("Ano: ");
                        int ano = scan.nextInt();
                        scan.nextLine();
                        Cliente_Novo.setCPF(cpf);
                        Cliente_Novo.setData_de_Nascimento(dia_nascimento,mes,ano);
                        Endereco End_Novo_Cliente = new Endereco(Rua, numero, Bairro,Cidade, Estado, Pais, End_Complemento, CEP);
                        Cliente_Novo.setEndereco(End_Novo_Cliente);               
                        this.Clientes.add((Clientes) Cliente_Novo);
                        break;
                }
                
            }catch(NumberFormatException e)
            {
                opcao--;
                System.out.println(e + "voce tem mais " + opcao+" Tentativas");
            }
            catch(InputMismatchException e)
            {
                opcao--;
                System.out.println("Digite valores validos " + opcao+" Tentativas");
                continue;
            }
            
        }
        
        GerenArquivos.SalvarArquivoClientes(Clientes);
    }

    public int Encontra_Cliente(String CPF)
    {
        for(int i =0;i<Clientes.size();i++)
        {
            if(CPF.equals(Clientes.get(i).getCPF()))
            {
                return i;
            }
        }
        return -1;
    }

    public int indiceCliente(Scanner scan) // Encontra o cliente, caso nao esteja cadastrado realiza o cadastro;
    {
        System.out.println("Digite seu CPF");
        String CPF = scan.nextLine();
        
        if(!ValidaCPF.isCPF(CPF))
            {
                throw new IllegalArgumentException("CPF invalido!");
            }
                
        int indiceCliente = Encontra_Cliente(CPF);
        
        while(indiceCliente == -1) // Cadastra o cliente e procura ele, se encontrar sair segue o codigo
        {
            Cadastrar_Cliente(scan,CPF);
            indiceCliente = Encontra_Cliente(CPF);
        }
        return indiceCliente;
    }

    public void ListaClientes()
    {
        for(int i = 0 ; i<Clientes.size();i++)
        {
            System.out.println(Clientes.get(i).SaidaArquivo());
        }
    }

///////////////////////////////////////////////////////////////////////////////
///
///                 Contas                                                 ////
///
///////////////////////////////////////////////////////////////////////////////

    public void Acessar_Conta(Scanner scan)
        {
            int opcao =1;
            Conta Solicitada = loginConta(scan);
            
            if(Solicitada==null)
                return;

            while(opcao!=0)
            {
                System.out.println("Oque você deseja fazer?");
                System.out.println("01 -> Consultar Saldo");
                System.out.println("02 -> Realizar Transferencia");
                System.out.println("03 -> Depositar");
                System.out.println("04 -> Sacar");
                System.out.println("05 -> Realizar Pagamento");
                System.out.println("06 -> Em Breve (Atualizar Cadastro) ");
                System.out.println("07 -> Historico Bancario");
                System.out.println("00 -> Sair da Conta");
                
                opcao = scan.nextInt();
                scan.nextLine();
                boolean acesso = true;
                try
                {
                    switch(opcao)
                    {
                        case 0:
                            break;
                        case 1: 
                            System.out.println("Saldo: " + Solicitada.getSaldo());
                            break;
                        case 2: 
                            int Numbanco =0;
                            int NumAgencia=0;
                            int NumConta = 0;
                            float valor = 0f;
                            int senha = 0;
                            while(acesso)
                            {
                                acesso=false;
                                try{
                                    //System.out.println("Numero do Banco de Destino: ");//nao sera necessario aqui
                                    //Numbanco = scan.nextInt();
                                    System.out.println("Numero do Agencia de Destino: ");
                                    NumAgencia = scan.nextInt();
                                    System.out.println("Numero do Conta de Destino: ");
                                    NumConta = scan.nextInt();
                                    System.out.println("Valor a ser transferido: ");
                                    valor = scan.nextFloat();
                                    System.out.println("Sua Senha: ");
                                    senha = scan.nextInt();
                                }catch(IllegalArgumentException e)
                                {
                                    System.out.println(e);
                                    acesso=true;
                                }
                                
                            }
                            acesso=EnviarTransferencia(0, NumAgencia, NumConta, valor, 0, Solicitada.getNum_Agencia(), Solicitada.getNum_Conta());
                            if (acesso)
                            {
                                Solicitada.transferir(Numbanco,NumAgencia,NumConta, valor, senha);
                                Agencias.get(Solicitada.getNum_Agencia()-100).alteraConta(Solicitada);
                            }
                            else System.out.println("Conta de Destino Não encontrada");
                            break;
                        case 3: 
                            System.out.println("Valor a ser depositado: ");
                            valor = scan.nextFloat();
                            System.out.println("Sua Senha: ");
                            senha = scan.nextInt(); 
                            Solicitada.depositar(valor, senha);
                            Agencias.get(Solicitada.getNum_Agencia()-100).alteraConta(Solicitada);
                            break;
                        case 4: 
                            System.out.println("Valor a ser sacado: ");
                            valor = scan.nextFloat();
                            System.out.println("Sua Senha: ");
                            senha = scan.nextInt(); 
                            Solicitada.sacar(valor, senha);
                            Agencias.get(Solicitada.getNum_Agencia()-100).alteraConta(Solicitada);
                            break;
                        case 5:
                            System.out.println("Descreva o pagamento: ");
                            String TipoPagamento = scan.nextLine();
                            System.out.println("Valor a ser pago: ");
                            valor = scan.nextFloat();
                            System.out.println("Sua Senha: ");
                            senha = scan.nextInt(); 
                            Solicitada.realizarPag(valor, senha, TipoPagamento);
                            Agencias.get(Solicitada.getNum_Agencia()-100).alteraConta(Solicitada);
                            break;
                        case 6:
                            System.out.println("Em Desenvolvimento");
                            break;
                        case 7: 
                            System.out.println("Historico Completo");
                            Solicitada.HistoricoMovimentacoes();
                            break;
                        default:
                            System.out.println("Essa opcao nao existe meu cria! \nDa uma olhada nas opcoes disponiveis e tenta novamente");
                            opcao=999;
                        }    
                }catch(IllegalArgumentException e)
                {
                    System.err.println(e.getMessage());
                }catch(InputMismatchException e)
                {
                    System.err.println("Digite valores validos");
                }
            }
                
                if(opcao==0)
                {
                    return;
                }
                System.out.println("0 para Não ou Qualquer outro numero para Sim");
                opcao = scan.nextInt();
            
        }

    public Conta loginConta(Scanner scan)
    {
        Conta Solicitada = null;
        boolean Acesso = true;
        while(Acesso)
            {
                Acesso=false;
                try
                {
                    System.out.println("Fala Cria vou precisar dos seguintes daddos");
                    System.out.printf("Agencia: ");
                    int Num_Agencia = scan.nextInt();
                    System.out.printf("Conta: ");
                    int Num_Conta = scan.nextInt();
                    System.out.printf("Senha: ");
                    int Senha = scan.nextInt();
                    
                    int indiceAgencia = IndiceAgencia(Num_Agencia);
                    if(indiceAgencia==-10)
                    {
                        System.out.println("Agencia não Encontrada");
                        break;
                    }
                    try{
                        Solicitada = Agencias.get(indiceAgencia).EncontraConta(Num_Conta, Senha);
                    }catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                        break;
                    }
                }catch(InputMismatchException e)
                {
                    System.out.println("Digite apenas Numeros");
                    scan.nextLine();
                    Acesso=true;
                }    
            }
            return Solicitada;
    }
    
    public void Cadastrar_Conta(Scanner scan)
    {
        ////// Cadastra e ou Encontra Cliente///////

        boolean teste = true;
        int indiceCliente =-1;
        
        while(teste)
        {
            try{
                teste = false;
                indiceCliente = indiceCliente(scan);
            }catch(IllegalArgumentException e)
            {
                System.out.println(e);
                teste= true;
            }
        }

    ///// Exibe Agencias Cadastradas e Retorna indice Da Escolhida ////
    /*/*/int indiceAgencia = indiceAgencia(scan);
    //////////////////////////////////////////////////////////////////
        
        teste=true;
        Random gerador = new Random();  
        int numConta =0;  
        while(teste)    
        {
            teste=false;
            numConta = gerador.nextInt(200000);  
            try
                {  
                    ////// pega a lista de conta da Agencia no indice NumAgencia
                    LinkedList<Conta> Percorre = Agencias.get(indiceAgencia).getContas();
                    for( int i =0 ; i< Percorre.size();i++)   // verifica se existe outra conta com mesmo numero
                    {
                        if(Percorre.get(i).getNum_Conta() == numConta)
                        {
                            teste=true;
                            break;
                        }
                    }  
                }catch(IndexOutOfBoundsException e)
                {

                }
            }
            System.out.println("Numero da Conta e: " + numConta);   
            System.out.println("Digite a Senha Numerica: ");
            int senha = scan.nextInt(); 
            
            System.out.println("Escolha uma opção: ");  
            System.out.println("1-Conta normal");
            System.out.println("2-Conta conjunta");              
            int op1 = scan.nextInt();
            
            boolean conjunta;             
            if(op1 == 1) 
                conjunta = false;
            else conjunta = true;

            Data Inc = Data.DataAtual();
            
            System.out.println("Digite o tipo da conta: ");
            System.out.printf("1-Poupança\n2-Corrente\n3-Salario\n");
            op1 = scan.nextInt(); //op1 == Tipo Conta
            scan.nextLine();
            /////// Transforma NumAgenia que esta com o Indice da Agencia no Numero da Agencia /////
            int NumAgencia = Agencias.get(indiceAgencia).getNum_Agencia();
            
            System.out.println("Numero da Agencia: " + NumAgencia);

            Conta Nova = null;
            switch(op1)
            {
                    case 1:
                        Nova = new Poupanca(numConta, senha, 0, conjunta, Clientes.get(indiceCliente), NumAgencia, Inc, 0);
                        break;
                    case 2:
                        Nova = new Corrente(numConta, senha, 0, conjunta, Clientes.get(indiceCliente), NumAgencia, Inc, 0, 25);
                        break;
                    case 3:
                        Nova = new Salario(numConta, senha, 0, conjunta, Clientes.get(indiceCliente), NumAgencia, Inc, 1000, 1000);
                        break;
            }
            if(conjunta)
            {
                try{
                    
                    Nova.setCliente_secundario(CadastrarSegundoTitular(scan));
                }catch(NullPointerException e)
                {
                    System.out.println(e);
                }
            }
            LinkedList<Conta> AtualizaContas = Agencias.get(indiceAgencia).getContas();
            AtualizaContas.add(Nova);
            GerenArquivos.SalvarArquivoContas(NumAgencia, AtualizaContas);
            Agencias.get(indiceAgencia).CarregarArquivos(Clientes);
                
    }

    public Clientes CadastrarSegundoTitular(Scanner scan)
    {
        int indiceCliente = indiceCliente(scan);
        return Clientes.get(indiceCliente);
    }

    public void ListaContas()
    {
        for(int i = 0; i<Agencias.size();i++)
        {
            Agencias.get(i).ListaContas();
        }
    }

    public boolean EnviarTransferencia(int numBancoDestino, int numAgenciaDestino,int numContaDestino,Float valor,int NumBancoOrigem,int NumAgenciaOrigem,int NumContaOrigem)
    {
        for(int i = 0;i<Agencias.size();i++)
        {
            if(Agencias.get(i).getNum_Agencia()==numAgenciaDestino)
            {
                return Agencias.get(i).EnviarTransferencia(numContaDestino, valor, NumBancoOrigem, NumAgenciaOrigem, NumContaOrigem);
            }
        }
        return false;
    }

 //////////////////////////////////////////////////////////////////////////////
 ///
 ///                Salvar e Carregar Arquivos                              ///
 ///
 //////////////////////////////////////////////////////////////////////////////  
   
    public void CarregarBanco() // Rodando e Funcionando
    {
        this.Agencias=GerenArquivos.Carregar_Agencias();
        this.Clientes=GerenArquivos.CarregarClientes();
        for(int i =0; i<Agencias.size();i++)
        {
            Agencias.get(i).CarregarArquivos(Clientes);;
        }
    }

    public void SalvarBanco() //Rodando E funcionando
    {
        GerenArquivos.SalvarArquivoAgencia(Agencias);
        GerenArquivos.SalvarArquivoClientes(Clientes);
        for(int i =0;i<Agencias.size();i++)
        {
            Agencias.get(i).SalvarArquivo();
        }
    }
  
}
