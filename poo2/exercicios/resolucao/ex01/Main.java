public class Main {
    public static void main(String[] args) {
        Cliente r1 = new Cliente("Valter", "Monte", "Segismundo");
        ContaBancaria c1 = new ContaBancaria(200,0000,500.0f,"Valter");
        ContaCorrente c2 = new ContaCorrente(200,0001,1500.f,r1,1000.f);
        ContaPoupanca c3 = new ContaPoupanca(200,0002,500.0f,r1, 200.0f);
        c2.setSaldo(1000.0f);
        c3.setSaldo(500.0f);
        c2.depositar(390.0f);
        ContaBancaria.imprimirsaldo(c2);
        c3.depositar(900);
        c3.imprimirsaldo();
        c2.sacar(40.0f,0001);
        ContaBancaria.imprimirsaldo(c2);
        c3.sacar(50.0f,0002);
        c3.imprimirsaldo();
    }
}