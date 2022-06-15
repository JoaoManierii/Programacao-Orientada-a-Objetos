public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta ();
        c1.modelo= "BIC Cristal";
        c1.cor= "Azul";
        // c1.ponta= 0.5f;
        c1.carga = 80;
        c1.tampar();
        //c1.tampada= true;
        // c1.tampar();
        //c1.rabiscar();
        c1.status();
        //Caneta c2 = new Caneta ();
        //c2.cor = "Preta";
        //c2.modelo = "UFU";
        //c2.destampar();
        //c2.status();
        //c2.rabiscar();
    }
}