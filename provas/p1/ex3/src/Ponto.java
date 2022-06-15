public class Ponto {
    public float x;
    public float y;

    public Ponto(){
    }

    public Ponto(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public void imprime_ponto(){
        System.out.println("O ponto digitado é: (" + x + "," + y + ")");
    }

}