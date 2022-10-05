public class Circulo extends FormaBidimensional {
    private double raio;
    private final double pi = 3.14;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getPi() {
        return pi;
    }

    @Override
    public double obterArea() {
        this.area = this.pi*(this.raio*this.raio);
       return area;
    }

}
