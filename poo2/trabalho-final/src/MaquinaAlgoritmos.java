import java.util.Scanner;

public final class MaquinaAlgoritmos extends AbstractFactory{

    private  static final MaquinaAlgoritmos INSTANCE = new MaquinaAlgoritmos();


    public static MaquinaAlgoritmos getInstance(){
        return INSTANCE;
    }

    private MaquinaAlgoritmos(){

    }

    @Override
    Algoritmo getAlgoritmo(String AlgoritmoType) {
        Scanner sc = new Scanner(System.in);
        if(AlgoritmoType.equalsIgnoreCase("Arvore")){
            System.out.println("Digite a quantidade de árvores");
            int arv = sc.nextInt();
            System.out.println("Digite a medida");
            int medida = sc.nextInt();
            return new Arvore(arv,medida);
        }else if(AlgoritmoType.equalsIgnoreCase("Kvizinho")){
            //return new KVizinhos();
            System.out.println("kvizinhos");
        }else if(AlgoritmoType.equalsIgnoreCase("Rede Neural")){
            //return new RedeNeural();
            System.out.println("Rede Neural");
        }
        return null;
    }
}
