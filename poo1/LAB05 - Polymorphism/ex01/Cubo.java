public class Cubo extends FormaTridimensional{
private double lado;


    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        this.area = 6*(this.lado*this.lado);
        return area;
    }
    @Override
    public double obterVolume() {
        volume = (this.lado*this.lado*this.lado);
        return volume;
    }
}
