public class Main {
    public static void main(String[] args) {
        Forma f1 = new Circulo(10.0);
        System.out.println(f1.getNome());
        Forma f2 = new Quadrado(10.0);
        System.out.println(f2.getNome());
        Forma f3 = new Triangulo(10.0, 10.0);
        System.out.println(f3.getNome());
        Forma f4 = new Esfera(10.0);
        System.out.println(f4.getNome());
        Forma f5 = new Cubo(10.0);
        System.out.println(f5.getNome());
        Forma f6 = new Tetraedro(10.0, 10.0, 10.0);
        System.out.println(f6.getNome());
    }
}
