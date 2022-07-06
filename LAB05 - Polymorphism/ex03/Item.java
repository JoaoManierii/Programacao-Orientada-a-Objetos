public class Item {
    private String titulo;
    private int tempoDuracao;
    private String comentarios;

    public Item() {
    }

    public Item(String titulo, int tempoDuracao, String comentarios) {
        this.titulo = titulo;
        this.tempoDuracao = tempoDuracao;
        this.comentarios = comentarios;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTempoDuracao() {
        return tempoDuracao;
    }

    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public void print(){
        System.out.println("O titulo do filme eh: "+this.getTitulo());
        System.out.println("O tempo de duracao do filme eh: "+this.getTempoDuracao());
        System.out.println("O comentario do filme eh: "+this.getComentarios());

    }
}
