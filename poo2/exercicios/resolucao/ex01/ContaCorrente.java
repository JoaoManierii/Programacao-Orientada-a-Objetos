public class ContaCorrente extends ContaBancaria implements Tributavel{


    public double limiteespecial;



    public double getLimiteespecial() {
        return limiteespecial;
    }

    public void setLimiteespecial(double limiteespecial) {
        this.limiteespecial = limiteespecial;
    }


    public ContaCorrente(int numero, int senha, double saldo, Cliente nometitular, double limiteespecial) {
        super(numero, senha, saldo, nometitular);
        this.limiteespecial = limiteespecial;
    }

    public boolean sacar(double valor, int senha) {
        if(saldo<valor && senha == this.getSenha())
            return false;

        if(senha != this.getSenha())
            return false;

        else
            return true;
    }

    @Override
    public double getValorImposto() {
        return 0.01;
    }

}
