public class Ingresso {
    protected int valor;
    protected int valorVip;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValorVip() {
        return valorVip;
    }

    public void setValorVip(int valorVip) {
        this.valorVip = valorVip;
    }

    public void escreverValor() {
        this.setValor(10);
        System.out.println("O valor do Ingresso eh: "+this.getValor());
    }
}
