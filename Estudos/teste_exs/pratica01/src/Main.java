public class Main {
    public static void main(String[] args) {
        Vape v1 = new Vape ();
        v1.marca= "Vaporesso";
        v1.modelo= "Sky Solo Plus";
        v1.potencia= 50;
        v1.tamanho_tanque=100;
        v1.status();
        v1.tanque();

        Vape v2 = new Vape ();
        v2.marca= "Vaporesso";
        v2.modelo= "Sky Solo ";
        v2.potencia= 30;
        v2.tamanho_tanque=5;
        v2.status();
        v2.tanque();
    }
}