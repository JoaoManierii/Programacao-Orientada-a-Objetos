public abstract class Funcionario {

    public float comissao;
    public String nome;
    public float meta;

    final float bateu(float vendas) {
        if (vendas >= meta) {
            return calculaComissao(vendas);
        }
        else {
            return calculaComissao(vendas)*0.8f;
        }
    }

    public abstract float calculaComissao (float vendas);

}
