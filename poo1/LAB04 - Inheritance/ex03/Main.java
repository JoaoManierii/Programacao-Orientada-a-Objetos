public class Main {
    public static void main(String[] args) {

        Ingresso c1 = new Ingresso();
        c1.escreverValor();

        Ingresso i2 = new Vip();
        i2.setValorVip(10);

        Normal i3 = new Normal();
        i3.imprime();

        CamaroteInferior i4 = new CamaroteInferior();
        i4.imprimeLocalizacaIngresso();

        CamaroteSuperior i5 = new CamaroteSuperior();
        i5.valorIngresso();
        i5.imprimeLocalizacaIngresso();
    }
}