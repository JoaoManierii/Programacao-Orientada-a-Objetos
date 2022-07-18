public class Servico implements Classificavel{
    private float preco;

    public boolean eMenorQue ( Classificavel o) {
        Servico compara = ( Servico ) o;
        if ( this . preco < compara . preco ) {
            return true ;
        } else {
            return false ;
        }
    }
}
