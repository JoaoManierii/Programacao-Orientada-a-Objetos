public interface IMaquinaDeBebidas {

    public static IRefrigerante entregarRefrigerante() {
        return new IRefrigerante(IRefrigerante.pegarRefri());
    }
    public static ISuco entregarSuco()
    {
        return new ISuco(ISuco.pegarSuco());
    }
}
