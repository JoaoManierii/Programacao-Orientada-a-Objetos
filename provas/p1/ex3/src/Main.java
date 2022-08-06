import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ponto []p = new Ponto[30];
        float []x = new float[30];
        float []y = new float[30];
 
        System.out.println("Digite quantos pontos deseja criar:");
        int n = sc.nextInt();
        for(int i = 0; i<n; i++)
        {
            System.out.println("Digite as coordenadas do ponto: ");
            x[i] = sc.nextFloat();
            y[i] = sc.nextFloat();
            p[i] = new Ponto(x[i],y[i]);
        }
        System.out.println("Digite o raio para obter a area:");
        int p1;
        p1 = sc.nextInt();
        Circulo pCirculo;
        pCirculo = p[p1].areadoCirculo(p[p1]);
        pCirculo.areadoCirculo();

        System.out.println("Digite o raio para obter o perimetro:");
        int p2;
        p2 = sc.nextInt();
        Circulo pCirculo;
        pCirculo = p[p2].perimetro(p[p2]);// check:<<<erro:?? >>>>
        Circulo.perimetro();
        System.out.println("O perimetro eh: "+this.perimetro());

        sc.close();

// check:<<<erro: faltou o vetor de círculos e a busca pelo menor>>>>


    }
}