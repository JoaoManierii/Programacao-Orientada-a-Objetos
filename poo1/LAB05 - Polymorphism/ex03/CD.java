public class CD extends Item{
    private String artista;

    public CD(String artista) {
        this.artista = artista;
    }

    public CD(String titulo, int tempoDuracao, String comentarios, String artista) {
        super(titulo, tempoDuracao, comentarios);
        this.artista = artista;
    }

    public CD() {

    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void print() {
        System.out.println("O artista do filme eh: "+this.getArtista());
    }
}
