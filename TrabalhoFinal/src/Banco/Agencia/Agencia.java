package Banco.Agencia;

import java.util.LinkedList;

import Banco.Agencia.Contas.Conta;
import Banco.Agencia.Funcionarios.Funcionario;
import Banco.Agencia.Funcionarios.Gerente;
import Banco.Clientes.Clientes;
import Suporte.Endereco;
import Suporte.GerenArquivos;
import Suporte.Pessoa;

public class Agencia {
    private int Num_Agencia;
    private String Nome_Agencia;
    private Gerente Gerente;
    private Endereco endereco_agencia;
    private LinkedList<Conta> contas; 
    private LinkedList<Pessoa> Funcionarios;
    

    
    public Agencia(String nome_Agencia,int num_Agencia) {
        Num_Agencia = num_Agencia;
        Nome_Agencia = nome_Agencia;
        contas = new LinkedList<>();
        Funcionarios = new LinkedList<>();
    }

    public Agencia(int Num_Agencia, String Nome_Agencia, Gerente Gerente, Endereco endereco_agencia) {
        this.Num_Agencia = Num_Agencia;
        this.Nome_Agencia = Nome_Agencia;
        this.Gerente = Gerente;
        Gerente.setAgencia(this.Num_Agencia);
        Gerente.setEsta_Em_uma_Agencia(true);
        this.endereco_agencia = endereco_agencia;
        contas = new LinkedList<>();
        Funcionarios = new LinkedList<>();
    }

    /////////////////////////////////////////////////
    ///
    ///             Getters e Setters             ///
    ///
    /////////////////////////////////////////////////

    public int getNum_Agencia() {
        return this.Num_Agencia;
    }

    public void setNum_Agencia(int Num_Agencia) {
        this.Num_Agencia = Num_Agencia;
    }

    public String getNome_Agencia() {
        return this.Nome_Agencia;
    }

    public void setNome_Agencia(String Nome_Agencia) {
        this.Nome_Agencia = Nome_Agencia;
    }

    public Gerente getGerente() {
        return this.Gerente;
    }

    public LinkedList<Pessoa> getFuncionarios() {
        return this.Funcionarios;
    }

    public void setFuncionarios(LinkedList<Pessoa> Funcionarios) {
        this.Funcionarios = Funcionarios;
    }

    public void setGerente(Gerente Novo, Funcionario AntigoCargo) 
    {
        RemoverGerenteAtual();

        AdicionarNovoGerente(Novo, AntigoCargo);
        
    }

    public Endereco getEndereco_agencia() {
        return this.endereco_agencia;
    }

    public void setEndereco_agencia(Endereco endereco_agencia) {
        this.endereco_agencia = endereco_agencia;
    }
    
    public LinkedList<Conta> getContas() {
        return this.contas;
    }

    public void setContas(LinkedList<Conta> contas) {
        this.contas = contas;
    }
    
    ///////////////////////////////////////////////////
    ////
    ////       Saida de Dados                      ////
    ////
    ///////////////////////////////////////////////////


    public void ImprimeNome_e_Localizacao()
    {
        System.out.println(Nome_Agencia + ": " + endereco_agencia.getEnd_Rua() + ", " + endereco_agencia.getEnd_Num()+ ", " +endereco_agencia.getEnd_Cidade()+ ", " + endereco_agencia.getEnd_Estado()+ ", " + endereco_agencia.getEnd_Pais()+ ", " + endereco_agencia.getEnd_Cep());
    }

    public void LocalizaAgencia(String Cidade, String Estado)
    {
        if(this.endereco_agencia.getEnd_Cidade().equals(Cidade) && this.endereco_agencia.getEnd_Estado().equals(Estado))
        {
            ImprimeNome_e_Localizacao();
        }
    }

    public void LocalizaAgencia(String Bairro, String Cidade, String Estado)
    {
        if(this.endereco_agencia.getEnd_Bairro()==Bairro && this.endereco_agencia.getEnd_Cidade().equals(Cidade) && this.endereco_agencia.getEnd_Estado().equals(Estado))
        {
            ImprimeNome_e_Localizacao();
        }
    }

    public void LocalizaAgencia(String Estado)
    {
        if(this.endereco_agencia.getEnd_Estado().equals(Estado))
        {
            ImprimeNome_e_Localizacao();
        }
    }

    public String DadosAgencia()
    {
        String Data = this.Nome_Agencia +";"+
                        this.Num_Agencia +";"+
                        endereco_agencia.DadosEndereco();
        return Data;
    }


    ////////////////////////////////////////////////////
    ////
    ////          Salvar e Carregar Dados           ////
    ////
    ////////////////////////////////////////////////////

    public void CarregarArquivos(LinkedList<Clientes> Clientes)
    {
        carregar_Contas(Clientes);
        carregar_Funcionario();
    }

    public void carregar_Funcionario()
    {
        this.Funcionarios=GerenArquivos.Carregar_Funcioanrios(this.Num_Agencia);
        for(int i = 0 ; i < Funcionarios.size(); i++)
        {
            try{
                Gerente Encontra = (Gerente) Funcionarios.get(i);
            if(Encontra.getCargo_na_empresa().equals("Gerente"))
                {      
                this.Gerente = Encontra;
                }
            }catch(ClassCastException e)
            {
                continue;
            }
        }
    }

    public void carregar_Contas(LinkedList<Clientes> Clientes)
    {
        this.contas=GerenArquivos.Carregar_contas(this.Num_Agencia, Clientes);
        for(int i = 0 ; i < contas.size(); i++)
        {
            contas.get(i).CarregarMovimentacoes();
        }
    }

    public void SalvarArquivo()
    {
        GerenArquivos.SalvarArquivoContas(Num_Agencia,contas);
        for(int i = 0 ; i< contas.size();i++)
        {
            contas.get(i).SalvarMovimentacoes();
        }
        GerenArquivos.SalvarArquivoFuncionarios(Num_Agencia,Funcionarios);
    }

    ///////////////////////////////////////////////////
    ///
    ///         Funcionarios                    //////
    ///
    //////////////////////////////////////////////////

    public void RemoverGerenteAtual()
    {
        if(this.Gerente!=null)
        {
            for(int i =0 ; i< Funcionarios.size(); i++)
            {
                try{
                    Gerente Percorre = (Gerente) Funcionarios.get(i);
                    if(Percorre.getCPF().equals(this.Gerente.getCPF()))
                    {
                        Percorre.setAgencia(0);
                        Percorre.setEsta_Em_uma_Agencia(false);
                        Percorre.setCargo_na_empresa("Antigo Gerente");
                        Funcionarios.remove(i);
                        Funcionarios.add(i, Percorre);
                    }
                }catch(ClassCastException e)
                {
                    continue;
                }
            }
            GerenArquivos.SalvarArquivoFuncionarios(Num_Agencia,Funcionarios);
        }
    }

    public void AdicionarNovoGerente(Gerente Novo,Funcionario AntigoCargo)
    {
        for(int j = 0 ; j < Funcionarios.size();j++)
        {
            Funcionario TempFunc = (Funcionario) Funcionarios.get(j);
            if(TempFunc.equals(AntigoCargo))
            {
                Funcionarios.remove(j);
                Funcionarios.add(j,Novo);
                Novo.setAgencia(this.Num_Agencia);
                Novo.setEsta_Em_uma_Agencia(true);       
                this.Gerente = Novo;
                break;
            }

        }
        GerenArquivos.SalvarArquivoFuncionarios(Num_Agencia,Funcionarios);
    }

    public boolean isFuncionario_dessa_Agencia(Funcionario Procurado)
    {
        for(int i = 0 ;i < Funcionarios.size() ; i ++)
        {
            if(Funcionarios.get(i).equals(Procurado))
            {
                return true;
            }
        }
        return false;
    }

    public int Encontra_Funcioanrio(int pos)
    {
        for(int j =0 ; j<Funcionarios.size();j++)
            {
                Funcionario Atual = (Funcionario) Funcionarios.get(j);
                System.out.print(pos+" - ");
                Atual.ImprimeDadosFuncionario();
                pos++;
             
            }
        return pos;
    }

    /////////////////////////////////////////////////
    ///
    ///         Contas                          /////
    ///
    ////////////////////////////////////////////////

    public Conta EncontraConta(int NumConta, int Senha) throws IllegalArgumentException
    {
        for(int i = 0 ; i< contas.size() ; i++)
        {
            if(contas.get(i).getNum_Conta()==NumConta)
            {
                if(contas.get(i).verificaSenha(Senha))
                {
                    if(!contas.get(i).isStatusDaConta())
                        throw new IllegalArgumentException("Conta Desativada");
                    return contas.get(i);
                }
                else throw new IllegalArgumentException("Senha Incorreta");
            }
        }
        throw new IllegalArgumentException("Conta Nao Encontrada");
    }

    public boolean EnviarTransferencia(int numConta, float valor, int NumBancoOrigem,int NumAgenciaOrigem,int NumContaOrigem)
    {
        for(int i = 0 ;i<contas.size();i++)
        {
            if(contas.get(i).getNum_Conta()==numConta)
            {
                contas.get(i).ReceberTransferencia(NumBancoOrigem, NumAgenciaOrigem, NumContaOrigem, valor);
                return true;
            }
        }
        return false;
    }

    public void ListaContas()
    {
        for(int i =0;i<contas.size();i++)
        {
            contas.get(i).Imprime();
        }
    }

    public void alteraConta(Conta Nova)
    {
        for(int i =0 ;i<contas.size();i++)
        {
            if(contas.get(i).getNum_Conta()==Nova.getNum_Conta())
                contas.set(i, Nova);
        }
    }
}
