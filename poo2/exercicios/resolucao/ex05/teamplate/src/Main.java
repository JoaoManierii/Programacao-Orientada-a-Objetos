public class Main {
    public static void main(String[] args) {
        Atendente a = new Atendente();
        Vendedor b = new Vendedor();
        Gerente c  = new Gerente();

        a.calculaComissao(5000f);
        b.calculaComissao(16000f);
        c.calculaComissao(18000f);

        System.out.println("Atendente " + a.bateu(5000f));
        System.out.println("Funcionario " + b.bateu(16000f));
        System.out.println("Gerente " + c.bateu(20000f));





    }
}