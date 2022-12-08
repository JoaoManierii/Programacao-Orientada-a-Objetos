public class Quiosque implements ISuco, IRefrigerante {

    public String pegarRefri() {
        return pegar();
    }

    public String pegarSuco() {
        return pegar();
    }

    public static String pegar() {
        return "Refrigerante";
    }


}