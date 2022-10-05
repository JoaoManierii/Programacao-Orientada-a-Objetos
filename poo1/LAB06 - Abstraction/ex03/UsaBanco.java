public abstract class UsaBanco {
    public static void main(String[] args) {
        ContaCorrente p1 = new ContaComum(100.0f, 256, 136, "ContaComum");
        p1.getSaldo(136);

        ContaEspecial v0 = new ContaEspecial(1, 256, 136, "ContaEspecial",500000.0f);
        v0.debitaValor(50.0f,136);
        ContaEspecial v1 = new ContaEspecial(2, 257, 137, "ContaEspecial",50000.0f);
        v1.debitaValor(100.0f,137);
        ContaEspecial v2 = new ContaEspecial(3, 258, 138, "ContaEspecial",10000.0f);
        v2.debitaValor(150.0f,138);
        ContaEspecial v3 = new ContaEspecial(4, 259, 139, "ContaEspecial",2000.0f);
        v3.debitaValor(200.0f,139);
        ContaEspecial v4 = new ContaEspecial(5, 260, 140, "ContaEspecial",5000.0f);
        v4.debitaValor(250.0f,140);
    }
    //Analise do funcionamento do sistema: O sistema cria os objetos soliciatados e atende os requisitos tambem solicitados. Nao entendi direito se eu tinha que
    //abstrair mais, fazer menu e etc, se for isso. Me mande msg pra eu refazer por favor,
}
