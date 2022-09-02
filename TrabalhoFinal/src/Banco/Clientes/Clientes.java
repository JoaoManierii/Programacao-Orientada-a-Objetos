package Banco.Clientes;
import java.io.Serializable;

import Suporte.*;


public class Clientes extends Pessoa implements Serializable{
    private String Escolaridade;

    public String SaidaArquivo(){
        return DadosPessoa() + ";" + Escolaridade;
    }

    public Clientes() {
        super(null,null,null,null,null,null );
    }

    public Clientes(String Nome, String CPF){
        super(Nome,CPF, null,null,null,null);
    }


    public Clientes(String Nome, String CPF,
     Data Data_de_Nascimento, Endereco Endereco, String Sexo, String Estado_Civil,
        String Escolaridade) 
    {
        super(Nome, CPF, Data_de_Nascimento, Endereco, Sexo, Estado_Civil);
        this.Escolaridade = Escolaridade;
    }


    public String getEscolaridade() {
        return this.Escolaridade;
    }

    public void setEscolaridade(String Escolaridade) {
        this.Escolaridade = Escolaridade;
    }
    
}