public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Nic", "Azul", 0.5f);
        Caneta c2 = new Caneta("KKK", "Laranja", 0.4f);
        System.out.println("As caneta 1 eh do modelo" +c1.getModelo()+ ", cor:"+c1.getCor()+", e tem ponta:"+c1.getPonta());
        System.out.println("As caneta 2 eh do modelo" +c2.getModelo()+ ", cor:"+c2.getCor()+", e tem ponta:"+c2.getPonta());
    }
}