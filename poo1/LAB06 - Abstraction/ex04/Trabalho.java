public class Trabalho extends Contato{
    private String tipo;
    int n;

    public Trabalho() {

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Trabalho(String tipo) {
        this.tipo = tipo;
    }

    public Trabalho(String apeido, String nome, String email, int aniversario, String tipo) {
        super(apeido, nome, email, aniversario);
        this.tipo = tipo;
    }

    @Override
    public void imprimeContato() {
        this.imprimirBasico();
        imprimirBasico();
        if(n==1) {
            setTipo("Chefe");
        }
        if(n==2) {
            setTipo("Colega");
        }
        if(n==3) {
            setTipo("Visitante");
        }
        System.out.println(getTipo());
    }
}
