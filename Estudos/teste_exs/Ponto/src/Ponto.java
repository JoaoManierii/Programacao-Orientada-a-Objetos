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
        System.out.println("Somar pontos:");
        System.out.println("Digite quais pontos deseja somar:");
        int p1;
        int p2;
        p1 = sc.nextInt();
        p2 = sc.nextInt();


        Ponto pSoma;
        pSoma = p[p1].soma_pontos(p[p1],p[p2]);
        pSoma.imprime_ponto();


        System.out.println("Multiplicar ponto por constante: ");
        System.out.println("Digite o valor da constante:");
        int c;
        c = sc.nextInt();
        System.out.println("Digite o ponto que deseja multiplicar: ");
        int p3 = sc.nextInt();
        p[p3].multiplica_ponto(c);
        p[p3].imprime_ponto();

        System.out.println("Incrementar posição: ");
        System.out.println("Digite o ponto que deseja incrementar: ");
        int p4 = sc.nextInt();
        String cord;
        System.out.println("Digite para onde o ponto vai incrementar: leste (l),oeste(o),norte(n),sul(s): ");
        cord = sc.next();
        p[p4].inc_dir(cord);


        System.out.println("Incrementar posição na diagonal: ");
        System.out.println("Digite o ponto que deseja incrementar: ");
        int p5 = sc.nextInt();
        String cord1;
        System.out.println("Digite para onde o ponto vai incrementar: sudeste, sudoeste, nordeste ou noroeste: ");
        cord1 = sc.next();
        p[p5].ind_diag(cord1);


        sc.close();




    }
}