public class Atendente implements Comissao {
    @Override
    public float comissao(float venda) {
        return (venda*0.01f);
    }
}
