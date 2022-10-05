public class Amigos extends Contato{
    private String grau;
    int n;

    public Amigos(String grau, int n) {
        this.grau = grau;
        this.n = n;
    }

    public Amigos(String apeido, String nome, String email, int aniversario, String grau, int n) {
        super(apeido, nome, email, aniversario);
        this.grau = grau;
        this.n = n;
    }

    public Amigos() {

    }

    public String getGrau() {
        return grau;
    }

    public void setGrau(String grau) {
        this.grau = grau;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void imprimeContato() {
        imprimirBasico();
        if(n==1) {
            setGrau("Melhor Amigo");
        }
        if(n==2) {
            setGrau("Amigo");
        }
        if(n==3) {
            setGrau("Conhecido");
        }
        System.out.println(getGrau());
    }
}
