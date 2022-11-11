public class Vendedor extends Funcionario {

    public Vendedor() {
        this.meta = 15000f;
        this.comissao = 0.02f;
    }
    @Override

    public float calculaComissao(float vendas) {
        return this.comissao*vendas;
    }
}
