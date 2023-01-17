import java.util.Random;

public class Main {

    public static void main(String[] args) {
        MaquinaAlgoritmos maq = MaquinaAlgoritmos.getInstance();
        Arvore arv = (Arvore) maq.getAlgoritmo("Arvore");

        arv.avaliaModelo();
        //System.out.println(arv.getState().Onfit(arv));
        //System.out.println(arv.getState().toString());
        //System.out.println(arv.getState().Onpredict(arv));
        //System.out.println(arv.getState().toString());
        arv.imprimeModelo();

    }

}
