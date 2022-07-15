public class ContaEspecial extends ContaCorrente {

    protected float limite;

    public ContaEspecial(float val, int num, int pwd, String tp, float limite) {
        super(val, num, pwd, tp);
        this.limite = limite;
    }

    public ContaComum setComum(String tp) {
        if (this.limite == 0)
            tp = "ContaComum";
        ContaComum x = new ContaComum(0, 12, 136, "ContaComum");
        return x;
    }
    public void checkEspecial (String tp) {
        if( tp == "ContaEspecial" && this.limite > 0) {
            if(this.getSaldo(136) == 0 ) {
                this.setEstado(136,1);
            }
        }
    }
}
