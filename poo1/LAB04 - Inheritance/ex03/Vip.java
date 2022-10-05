public class Vip extends Ingresso{
    protected int valorAdd;

    public Vip() {
    }

    public int getValorAdd() {
        return valorAdd;
    }

    public void setValorAdd(int valorAdd) {
        this.valorAdd = valorAdd;
    }

    public int escreveVip(int valorVip) {
        this.setValorVip(this.getValor()+this.getValorAdd());
        return getValorVip();
    }
}
