public class Cliente implements Classificavel{
    private String nome;

    public Cliente() {
    }

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean eMenorQue (Classificavel o) {
        Cliente compara = ( Cliente ) o;
        if ( this.nome.compareTo((compara.getNome())) < 0) {
            return true;
        } else {
            return false;
        }
    }
}
