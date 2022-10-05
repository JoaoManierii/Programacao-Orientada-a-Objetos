package Banco.Agencia.Contas;
import Banco.Clientes.Clientes;
import Suporte.Data;

public class Salario extends Conta {
    // limite para saque e limite para transferência.
    private float Limite_saque;
    private float Limite_transferencia;


    public Salario(int Num_Conta, int Senha_Conta, float saldo, boolean conjunta, Clientes Cliente_primario, int Num_Agencia, Data Abertura_de_Conta,
        float Limite_saque, float Limite_transferencia) 
    {
        super(Num_Conta, Senha_Conta, saldo, conjunta, Cliente_primario, Num_Agencia, Abertura_de_Conta);
        this.Limite_saque = Limite_saque;
        this.Limite_transferencia = Limite_transferencia;
    }

    @Override
    public String SaidaArquivo() {
        return "Salario;" + super.SaidaArquivo() + ";" + this.Limite_saque + ";" + this.Limite_transferencia;
    }


    public float getLimite_saque(int Senha) throws IllegalArgumentException
    {
        if(this.Senha_Conta == Senha)
            return this.Limite_saque;
        throw new IllegalArgumentException("Senha incorreta");
    }

    public void setLimite_saque(float Limite_saque) {
        this.Limite_saque = Limite_saque;
    }

    public float getLimite_transferencia(int Senha) throws IllegalArgumentException 
    {
        if(this.Senha_Conta == Senha)
            return this.Limite_transferencia;

        throw new IllegalArgumentException("Senha incorreta");
    }

    public void setLimite_transferencia(float Limite_transferencia) {
        this.Limite_transferencia = Limite_transferencia;
    }




}
