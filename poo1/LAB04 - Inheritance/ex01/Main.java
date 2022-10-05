public class Main {
    public static void main(String[] args) {
        C1 p1 = new C1();
        new C1(2, 2, 3);


        p1.mostrar_atributos();
        p1.mostrar_atributos_super();


        C2 p2 = new C2();
        new C2(2, 2, 3);

        p2.mostrar_atributos();
        p2.mostrar_atributos_super();

        C3 p3 = new C3();
        new C3(2 , 2, 3);

        p3.mostrar_atributos();
        p3.mostrar_atributos_super();


    }
}