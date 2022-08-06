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
        this.area = area;// check:<<<erro: isso é calculado, não passado como parâmetro>>>>
        this.perimetro = perimetro;// check:<<<erro: isso é calculado, não passado como parâmetro>>>>
    }

    public void areadoCirculo(float raio) {// check:<<<erro: sem parametro>>>>
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
// check:<<<erro: era esperado dois construtores>>>>
// check:<<<erro: sem get/set>>>>
// check:<<<erro: era esperado no segundo construtor alguma funcionalidade >>>>
// check:<<<erro: Pi é uma constante matemática. Não usar como variável. Dica: Math.PI>>>>
// check:<<<erro: a classe Ponto deveria ser usada para definir o 'ponto' na classe círculo >>>>
