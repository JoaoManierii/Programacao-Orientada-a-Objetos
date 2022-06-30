public class Esfera extends FormaTridimensional{
    private final double pi = 3.14;
    private double raio;

    public Esfera(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double obterArea() {
        this.area = 4*this.pi*(this.raio*this.raio);
        return area;
    }

    @Override
    public double obterVolume() {
        volume = (4/3)*pi*(this.raio*this.raio*this.raio);
        return volume;
    }
}
