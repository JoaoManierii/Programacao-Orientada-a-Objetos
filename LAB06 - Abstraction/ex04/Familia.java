public class Familia extends Contato{
    private String parentesco;
    int n; //numero para definir tipo de parentesco

    public Familia(String parentesco) {
        this.parentesco = parentesco;
    }

    public Familia(String apeido, String nome, String email, int aniversario, String parentesco) {
        super(apeido, nome, email, aniversario);
        this.parentesco = parentesco;
    }

    public Familia() {

    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void imprimeContato() {
        this.imprimirBasico();
        if(n==1) {
            setParentesco("Pai");
        }
        if(n==2) {
            setParentesco("Irmao");
        }
        if(n==3) {
            setParentesco("Irma");
        }
        System.out.println(getParentesco());
    }
}
