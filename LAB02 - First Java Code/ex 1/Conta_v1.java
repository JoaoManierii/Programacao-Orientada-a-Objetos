public class Conta_v1 {
    private double saldo;
    private double limite;

    public void depositar(double x) {
        saldo = saldo + x;
    }

    public void sacar(double x) {
        saldo = saldo - x;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setLimite(double x) {
        limite = x;
    }

    public double getLimite() {
        return limite;
    }

}

