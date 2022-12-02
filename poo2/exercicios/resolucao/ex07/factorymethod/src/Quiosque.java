public class Quiosque {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MaquinaDeBebidas refrigerante = entregarBebida.entrega("Refrigerante");
        MaquinaDeBebidas suco = entregarBebida.entrega("Suco");
        System.out.println(refrigerante.tipoDeBebida());
        System.out.println(suco.tipoDeBebida());

    }
}