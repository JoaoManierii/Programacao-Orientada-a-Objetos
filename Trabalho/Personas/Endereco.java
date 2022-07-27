package Personas;

public class Endereco {
    private String End_Rua;
    private int End_Num;
    private String End_Cidade;
    private String End_Estado;
    private String End_Pais;
    private String End_Complemento;
    private int End_Cep;


    public Endereco(String End_Rua, int End_Num, String End_Cidade, String End_Estado, String End_Pais, String End_Complemento, int End_Cep) {
        this.End_Rua = End_Rua;
        this.End_Num = End_Num;
        this.End_Cidade = End_Cidade;
        this.End_Estado = End_Estado;
        this.End_Pais = End_Pais;
        this.End_Complemento = End_Complemento;
        this.End_Cep = End_Cep;
    }


    public String getEnd_Rua() {
        return this.End_Rua;
    }

    public void setEnd_Rua(String End_Rua) {
        this.End_Rua = End_Rua;
    }

    public int getEnd_Num() {
        return this.End_Num;
    }

    public void setEnd_Num(int End_Num) {
        this.End_Num = End_Num;
    }

    public String getEnd_Cidade() {
        return this.End_Cidade;
    }

    public void setEnd_Cidade(String End_Cidade) {
        this.End_Cidade = End_Cidade;
    }

    public String getEnd_Estado() {
        return this.End_Estado;
    }

    public void setEnd_Estado(String End_Estado) {
        this.End_Estado = End_Estado;
    }

    public String getEnd_Pais() {
        return this.End_Pais;
    }

    public void setEnd_Pais(String End_Pais) {
        this.End_Pais = End_Pais;
    }

    public String getEnd_Complemento() {
        return this.End_Complemento;
    }

    public void setEnd_Complemento(String End_Complemento) {
        this.End_Complemento = End_Complemento;
    }

    public int getEnd_Cep() {
        return this.End_Cep;
    }

    public void setEnd_Cep(int End_Cep) {
        this.End_Cep = End_Cep;
    }


    
}
