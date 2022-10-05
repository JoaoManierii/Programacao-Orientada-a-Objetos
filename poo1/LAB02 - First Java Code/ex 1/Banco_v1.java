public class Banco_v1 {
    public static void main(String args[]) {
        Conta c1 = new Conta();
        c1.setLimite(300);
        c1.depositar(500);
        c1.sacar(200);
        System.out.println("O saldo é " + c1.getSaldo());
    }
}
