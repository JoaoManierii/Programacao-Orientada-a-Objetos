package Instituição;
import Personas.Endereco;
import Personas.Funcionarios.Gerente;

public class Agencia {
    private int Num_Agencia;
    private String Nome_Agencia;
    private Gerente Gerente;
    private Endereco endereco_agencia;


    public Agencia(int Num_Agencia, String Nome_Agencia, Gerente Gerente, Endereco endereco_agencia) {
        this.Num_Agencia = Num_Agencia;
        this.Nome_Agencia = Nome_Agencia;
        this.Gerente = Gerente;
        Gerente.setAgencia(this.Num_Agencia);
        Gerente.setEsta_Em_uma_Agencia(true);
        this.endereco_agencia = endereco_agencia;
    }

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

    public void setGerente(Gerente Gerente) {
        this.Gerente.setAgencia(0);
        this.Gerente.setEsta_Em_uma_Agencia(false);
        Gerente.setAgencia(this.Num_Agencia);
        Gerente.setEsta_Em_uma_Agencia(true);       
        this.Gerente = Gerente;
    }

    public Endereco getEndereco_agencia() {
        return this.endereco_agencia;
    }

    public void setEndereco_agencia(Endereco endereco_agencia) {
        this.endereco_agencia = endereco_agencia;
    }
    
    private void ImprimeNome_e_Localizacao()
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



    
}
