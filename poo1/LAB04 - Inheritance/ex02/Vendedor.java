public class Vendedor extends Funcionario{
private float valorFixo;
private float comissao;
private float vendas;

    public Vendedor(float valorFixo, float comissao, float vendas) {
        this.valorFixo = valorFixo;
        this.comissao = comissao;
        this.vendas = vendas;
    }

    public float getValorFixo() {
        return valorFixo;
    }

    public void setValorFixo(float valorFixo) {
        this.valorFixo = valorFixo;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public float salario_vendedor(float salario) {
         setSalario(valorFixo + (comissao*vendas));
        return getSalario();
    }
}
