public class Gerente implements Comissao{

    @Override
    public float comissao(float venda) {
        return (venda*0.03f);
    }
}
