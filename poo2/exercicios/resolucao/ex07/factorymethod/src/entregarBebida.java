public class entregarBebida {
    public static MaquinaDeBebidas entrega(String tipo) {
        if (tipo == "Refrigerante") {
            return new Refrigerante();
        } else if (tipo == "Suco") {
            return new Suco();
        }
        return null;
    }
}
