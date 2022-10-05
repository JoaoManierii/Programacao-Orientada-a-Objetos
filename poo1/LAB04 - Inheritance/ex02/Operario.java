public class Operario extends Funcionario{
    private float valorProducao;
    private float qtdProduzida;

    public Operario(float valorProducao, float qtdProduzida) {
        this.valorProducao = valorProducao;
        this.qtdProduzida = qtdProduzida;
    }

    public float getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(float valorProducao) {
        this.valorProducao = valorProducao;
    }

    public float getQtdProduzida() {
        return qtdProduzida;
    }

    public void setQtdProduzida(float qtdProduzida) {
        this.qtdProduzida = qtdProduzida;
    }

    public float salario_operario(float salario) {
        setSalario(valorProducao*qtdProduzida);
        return getSalario();
    }

}
