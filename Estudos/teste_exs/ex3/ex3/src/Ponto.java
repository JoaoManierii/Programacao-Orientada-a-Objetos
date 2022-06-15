public class Ponto {
    int x,y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void imprime_ponto() {
        System.out.println("O ponto digitado eh ("+x+","+y+")");
    }
    public Ponto soma_pontos(Ponto i, Ponto j) {
        int x1, y1;
        x1 = i.x + j.x;
        y1 = i.x + j.y;
        Ponto xt = new Ponto(x1,y1);
        return xt;
    }
    public static void soma_pontos (Ponto i, Ponto j, Ponto k) {
        int x1, y1;
        x1 = i.x + j.x;
        y1 = i.x + j.y;
        System.out.println("A soma de("+i.x+","+i.y+")com("+j.x+","+j.y+") eh("+k.x+","+k.y+")");
        k.x = x1;
        k.y = y1;
    }

    public static void cal_area (Ponto i, Ponto j, Ponto k) {
    }

    public void multiplica_ponto (int z) {
            x*=z;
            y*=z;
    }

}

