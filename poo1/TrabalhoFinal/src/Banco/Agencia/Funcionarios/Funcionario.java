package Banco.Agencia.Funcionarios;

import Suporte.Data;
import Suporte.Endereco;
import Suporte.Pessoa;

public class Funcionario extends Pessoa {
    private int Numero_Carteira_de_trabalho;
    private String Cargo_na_empresa;
    private float salario;
    private Data Data_de_Ingresso;
    private int RG_Num;//numeros
    private String RG_UF;//Letras



    public Funcionario(String Nome, String CPF, Data Data_de_Nascimento, Endereco Endereco, String Sexo, String Estado_Civil,
        int Numero_Carteira_de_trabalho, String Cargo_na_empresa, float salario, Data Data_de_Ingresso, int RG_Num, String RG_UF) 
        
    {
        super(Nome, CPF, Data_de_Nascimento, Endereco, Sexo, Estado_Civil);
        this.Numero_Carteira_de_trabalho = Numero_Carteira_de_trabalho;
        this.Cargo_na_empresa = Cargo_na_empresa;
        this.salario = salario;
        this.Data_de_Ingresso = Data_de_Ingresso;
        this.RG_Num = RG_Num;
        this.RG_UF = RG_UF;
    }


    public int getRG_Num() {
        return this.RG_Num;
    }

    public void setRG_Num(int RG_Num) {
        this.RG_Num = RG_Num;
    }

    public String getRG_UF() {
        return this.RG_UF;
    }

    public void setRG_UF(String RG_UF) {
        this.RG_UF = RG_UF;
    }

    public int getNumero_Carteira_de_trabalho() {
        return this.Numero_Carteira_de_trabalho;
    }

    public void setNumero_Carteira_de_trabalho(int Numero_Carteira_de_trabalho) {
        this.Numero_Carteira_de_trabalho = Numero_Carteira_de_trabalho;
    }

    public String getCargo_na_empresa() {
        return this.Cargo_na_empresa;
    }

    public void setCargo_na_empresa(String Cargo_na_empresa) {
        this.Cargo_na_empresa = Cargo_na_empresa;
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Data getData_de_Ingresso() {
        return this.Data_de_Ingresso;
    }

    public void setData_de_Ingresso(Data Data_de_Ingresso) {
        this.Data_de_Ingresso = Data_de_Ingresso;
    }


    public String DadosFuncionario() {
        
        String Data = DadosPessoa() + ";" + Numero_Carteira_de_trabalho +";"+
                                        Cargo_na_empresa +";"+
                                        salario +";"+
                                        Data_de_Ingresso.DadosData() +";"+
                                        RG_Num +";"+
                                        RG_UF +";";
        
        return Data;
    }

    public void ImprimeDadosFuncionario()
    {
        System.out.println(this.getNome() + " - " + this.getCPF() + "- " + this.Cargo_na_empresa);
    }

    public String DadosGerente()
    {
        throw new IllegalAccessError("Acesso Negado");
    }


}
