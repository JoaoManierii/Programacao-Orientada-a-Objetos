public class Forma {
    protected double area;

    public Forma() {

    }
    public String getNome() {
        return " ";
    }
    public double obterArea() {
        return area;
    }
    public double obterVolume() {
        return 0.0;
    }

    public void imprime_tipo () {
        System.out.println("Esse objeto eh da: " + getClass());
    }
}
