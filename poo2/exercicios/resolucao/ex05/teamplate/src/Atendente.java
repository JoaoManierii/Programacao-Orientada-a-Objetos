public class Atendente extends Funcionario{

    public Atendente() {
        this.meta = 10000f;
        this.comissao = 0.01f;
    }

    @Override
    public float calculaComissao(float vendas) {
        return this.comissao*vendas;
    }
}
