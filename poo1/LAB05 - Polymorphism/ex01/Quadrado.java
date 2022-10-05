public class Quadrado extends FormaBidimensional{

    private double lado;

    public Quadrado(double lado) {
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
        this.area = this.lado*this.lado;
        return area;
    }

}
