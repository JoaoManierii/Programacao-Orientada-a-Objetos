public class Gerente extends Funcionario{

    public Gerente() {
        this.meta = 20000f;
        this.comissao = 0.03f;
    }
    @Override
    public float calculaComissao(float vendas) {
        return this.comissao*vendas;
    }
}
