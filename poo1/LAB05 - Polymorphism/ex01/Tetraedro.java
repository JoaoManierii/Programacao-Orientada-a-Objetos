public class Tetraedro extends FormaTridimensional{

    private double altura;
    private double area_da_base;
    private double lado;

    public Tetraedro(double altura, double area_da_base, double lado) {
        this.altura = altura;
        this.area_da_base = area_da_base;
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getArea_da_base() {
        return area_da_base;
    }

    public void setArea_da_base(double area_da_base) {
        this.area_da_base = area_da_base;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double obterArea() {
        this.area = Math.sqrt(3)*(this.lado*this.lado);
        return area;
    }

    @Override
    public double obterVolume() {
        volume = (3/3)*this.area_da_base*this.altura;
        return volume;
    }
}
