public class Circulo {
    public int pontoCentral;
    public float raio;

    public float pi;

    public float area;

    public float perimetro;


    public Circulo(int pontoCentral, float raio, float pi, float area, float perimetro) {
        this.pontoCentral = pontoCentral;
        this.raio = raio;
        this.pi = 3.14f;
        this.area = area;
        this.perimetro = perimetro;
    }

    public void areadoCirculo(float raio) {
    this.area=this.pi*(this.raio*this.raio);
    System.out.println(" "+this.area);
    }

    public static double perimetro(double raio)
    {
        double per;
        per = 2*3.14*raio;
        return per;
    }


}
