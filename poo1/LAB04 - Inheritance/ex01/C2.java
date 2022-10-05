public class C2 extends C1 {
    public int var04;
    protected int var05;
    private int var06;

    public C2() {
        System.out.println("{CLASSE C2} Classe C2: chamada do construtor padrao, SEM parametros");
    }

    public C2(int var04, int var05, int var06) {
        super();
        this.var04 = var04;
        this.var05 = var05;
        this.var06 = var06;
        System.out.println("{CLASSE C2} Classe C2: chamada do construtor padrao, COM parametros");
    }

    public int getVar04() {
        return var04;
    }

    public void setVar04(int var04) {
        this.var04 = var04;
    }

    public int getVar05() {
        return var05;
    }

    public void setVar05(int var05) {
        this.var05 = var05;
    }

    public int getVar06() {
        return var06;
    }

    public void setVar06(int var06) {
        this.var06 = var06;
    }

    public void  mostrar_atributos() {
        System.out.println("{CLASSE C2} VARIAVEL DE C1 "+this.getVar01());
        System.out.println("{CLASSE C2} VARIAVEL DE C1 "+this.getVar02());
        System.out.println("{CLASSE C2} VARIAVEL DE C1 "+this.getVar03());

        System.out.println("{CLASSE C2} VARIAVEL DE C2 "+this.getVar04());
        System.out.println("{CLASSE C2} VARIAVEL DE C2 "+this.getVar05());
        System.out.println("{CLASSE C2} VARIAVEL DE C2 "+this.getVar06());
    }

    public void  mostrar_atributos_super() {
        System.out.println("VARIAVEL DE C1  (SUPER)"+super.getVar01());
        System.out.println("VARIAVEL DE C1  (SUPER)"+super.getVar02());
        System.out.println("VARIAVEL DE C1  (SUPER)"+super.getVar03());

        System.out.println("VARIAVEL DE C2  (SUPER)"+this.getVar04());
        System.out.println("VARIAVEL DE C2  (SUPER)"+this.getVar05());
        System.out.println("VARIAVEL DE C2  (SUPER)"+this.getVar06());
    }



}
