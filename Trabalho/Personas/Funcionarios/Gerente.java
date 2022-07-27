package Personas.Funcionarios;
import Personas.Data;
import Personas.Endereco;

public class Gerente extends Funcionario {
    private Boolean Formacao_Basica_EmGerencia;
    private int[] Data_Ingresso_Como_Gerente =  new int [3];
    private int Num_Agencia;
    private boolean Esta_Em_uma_Agencia;


    public Gerente(String Nome, int CPF, Data Data_de_Nascimento, Endereco Endereco, String Sexo, String Estado_Civil,
    int Numero_Carteira_de_trabalho, String Cargo_na_empresa, float salario, Data Data_de_Ingresso, int RG_Num, String RG_UF,
    Boolean Formacao_Basica_EmGerencia, int[] Data_Ingresso_Como_Gerente) 
    {
        super(Nome, CPF, Data_de_Nascimento, Endereco, Sexo, Estado_Civil, Numero_Carteira_de_trabalho, Cargo_na_empresa, salario, Data_de_Ingresso, RG_Num, RG_UF); 
        this.Formacao_Basica_EmGerencia = Formacao_Basica_EmGerencia;
        this.Data_Ingresso_Como_Gerente = Data_Ingresso_Como_Gerente;
        this.Esta_Em_uma_Agencia=false;
    }

    public Boolean isFormacao_Basica_EmGerencia() {
        return this.Formacao_Basica_EmGerencia;
    }

    public Boolean getFormacao_Basica_EmGerencia() {
        return this.Formacao_Basica_EmGerencia;
    }

    public void setFormacao_Basica_EmGerencia(Boolean Formacao_Basica_EmGerencia) {
        this.Formacao_Basica_EmGerencia = Formacao_Basica_EmGerencia;
    }

    public int[] getData_Ingresso_Como_Gerente() {
        return this.Data_Ingresso_Como_Gerente;
    }

    public void setData_Ingresso_Como_Gerente(int[] Data_Ingresso_Como_Gerente) {
        this.Data_Ingresso_Como_Gerente = Data_Ingresso_Como_Gerente;
    }

    public int getAgencia() {
        return this.Num_Agencia;
    }

    public void setAgencia(int Num_Agencia) {
        this.Num_Agencia = Num_Agencia;
    }

    public boolean getEsta_Em_uma_Agencia() {
        return this.Esta_Em_uma_Agencia;
    }

    public void setEsta_Em_uma_Agencia(boolean Esta_Em_uma_Agencia) {
        this.Esta_Em_uma_Agencia = Esta_Em_uma_Agencia;
    }

}
