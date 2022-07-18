public class Cliente implements Classificavel{
    private String nome;
    public boolean eMenorQue ( Classificavel o) {
        Cliente compara = ( Cliente ) o;
        if ( this.nome.length() < compara.nome.length() ) {
            return true;
        } else {
            return false;
        }
    }
}
