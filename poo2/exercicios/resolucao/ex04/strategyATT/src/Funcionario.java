public class Funcionario  {
    private String nome;
    private float vendas;
    private Comissao com;
    public Funcionario(String nome, float vendas, Comissao com) {
        this.nome = nome;
        this.com = com;
        this.vendas = vendas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVendas() {
        return vendas;
    }

    public void setVendas(float vendas) {
        this.vendas = vendas;
    }

    public void imprime() {
        System.out.println(nome+" " + com.comissao(vendas));
    }
}
