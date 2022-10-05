public class ContaPoupanca extends ContaBancaria{

    public double taxarendimento;

    public double getTaxarendimento() {
        return taxarendimento;
    }

    public void setTaxarendimento(double taxarendimento) {
        this.taxarendimento = taxarendimento;
    }

    public ContaPoupanca(int numero, int senha, double saldo, Cliente nometitular, double taxarendimento) {
        super(numero, senha, saldo, nometitular);
        this.taxarendimento = taxarendimento;
    }

    public void imprimirsaldo() {
        System.out.println("Seu saldo eh: "+this.saldo);
    }
}
