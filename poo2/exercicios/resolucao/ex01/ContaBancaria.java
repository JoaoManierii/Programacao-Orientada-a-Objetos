public class ContaBancaria {
    public int numero;
    private int senha;
    protected double saldo;
    public Cliente nometitular;

    public ContaBancaria(int numero, int senha, double saldo, Cliente nometitular) {
        this.numero = numero;
        this.senha = senha;
        this.saldo = saldo;
        this.nometitular = nometitular;
    }

    public ContaBancaria(int numero, int senha, float saldo, String valter) {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getNometitular() {
        return nometitular;
    }

    public void setNometitular(Cliente nometitular) {
        this.nometitular = nometitular;
    }

    public boolean sacar(double valor, int senha) {
        if(saldo<valor && senha == this.senha)
        return false;

        if(senha != this.senha)
            return false;

        else
        return true;
    }

    public void depositar(double valor) {
        this.saldo =+ valor;
    }

    public static void imprimirsaldo(ContaBancaria e) {
        System.out.println("Seu saldo eh: "+e.getSaldo());
    }
}
