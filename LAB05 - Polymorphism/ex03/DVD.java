public class DVD extends Item{
    private String diretor;

    public DVD() {
    }

    public DVD(String diretor) {
        this.diretor = diretor;
    }

    public DVD(String titulo, int tempoDuracao, String comentarios, String diretor) {
        super(titulo, tempoDuracao, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public void print() {
        System.out.println("O diretor do filme eh: "+this.getDiretor());
    }
}
