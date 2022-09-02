package Suporte;

public abstract class Pessoa {
    private String Nome;
    private String CPF;
    private Data Data_de_Nascimento;
    private Endereco Endereco;
    private String Sexo;
    private String Estado_Civil;


    public Pessoa(String Nome, String CPF, Data Data_de_Nascimento, Endereco Endereco, String Sexo, String Estado_Civil) {
        this.Nome = Nome;
        this.CPF = CPF;
        this.Data_de_Nascimento = Data_de_Nascimento;
        this.Endereco = Endereco;
        this.Sexo = Sexo;
        this.Estado_Civil = Estado_Civil;
    }


    public String getNome() {
        return this.Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCPF() {
        return this.CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Data getData_de_Nascimento() {
        return this.Data_de_Nascimento;
    }

    public void setData_de_Nascimento(int dia, int mes, int ano) {
        this.Data_de_Nascimento = new Data(dia, mes, ano);
    }

    public Endereco getEndereco() {
        return this.Endereco;
    }

    public void setEndereco(Endereco Endereco) {
        this.Endereco = Endereco;
    }

    public String getSexo() {
        return this.Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstado_Civil() {
        return this.Estado_Civil;
    }

    public void setEstado_Civil(String Estado_Civil) {
        this.Estado_Civil = Estado_Civil;
    }



    public String DadosPessoa() {
        String Data = this.Nome + ";" +
                this.CPF + ";" +
                this.Data_de_Nascimento.DadosData() + ";" +
                this.Endereco.DadosEndereco() + ";" +
                this.Sexo + ";" +
                this.Estado_Civil;
        
        return Data;
    }


    
}
