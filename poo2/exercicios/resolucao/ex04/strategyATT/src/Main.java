import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Atendente x = new Atendente();
        Vendedor y = new Vendedor();
        Gerente z = new Gerente();

        Funcionario x1 = new Funcionario("Ismael", 500.0f, x);
        Funcionario x2 = new Funcionario("Rodrigo", 500.0f, y);
        Funcionario x3 = new Funcionario("Joao", 500.0f, z);
        Comissao c1;

        x1.imprime();
        x2.imprime();
        x3.imprime();

    }
}