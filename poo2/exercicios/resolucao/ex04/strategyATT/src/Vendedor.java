public class Vendedor implements Comissao{
    @Override
    public float comissao(float venda) {
        return (venda*0.02f);
    }
}
