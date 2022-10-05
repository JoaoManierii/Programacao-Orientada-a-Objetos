public class Main {
    public static void main(String[] args) {
        Cliente []c = new Cliente[3];
        c[0] = new Cliente("Israel");
        c[1] = new Cliente("Virtual");
        c[2] = new Cliente("Machine");

        Produto []p = new Produto[3];
        p[0] = new Produto(930);
        p[1] = new Produto(675);
        p[2] = new Produto(5566);

        Servico []s = new Servico[3];
        s[0] = new Servico(98);
        s[1] = new Servico(64);
        s[2] = new Servico(10);

        Classificador c1 = new Classificador();
        c1.ordena(c);
        c1.ordena(p);
        c1.ordena(s);

        System.out.println("vetores ja ordenados");

        for(int i=0; i<3;i++){
            System.out.println(c[i].getNome());
        }
        for(Produto i : p) {
            System.out.println(i.getCodigo());
        }
        for(Servico i : s) {
            System.out.println(i.getPreco());
        }
        }
    }

