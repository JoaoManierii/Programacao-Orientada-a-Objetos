public class Main {
    public static void main(String[] args) {
        Pessoa c1 = new Pessoa("Joao", "469913", "57757538",20);

        Funcionario  c2 = new Funcionario("Carlos", "991335", "123456", 21, 20);
        c2.calculaSalario();

        Piloto c3 = new Piloto("Caue", "47896541", "174258963", 15, 10, 20);
        c3.calculaSalario();

        Atendente c4 = new Atendente("Luis", "51455", "6581247", 50, 25);
        c4.computaVenda();
        c4.calculaSalario();
    }
}