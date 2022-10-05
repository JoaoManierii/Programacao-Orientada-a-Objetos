public class C3 extends C2{
    public int var07;
    protected int var08;
    private int var09;

    public C3() {
        System.out.println("{CLASSE C3} Classe C3: chamada do construtor padrao, SEM parametros");
    }

    public C3(int var07, int var08, int var09) {
        super();
        this.var07 = var07;
        this.var08 = var08;
        this.var09 = var09;
        System.out.println("{CLASSE C3} Classe C3: chamada do construtor padrao, COM parametros");
    }



    public int getVar07() {
        return var07;
    }

    public void setVar07(int var07) {
        this.var07 = var07;
    }

    public int getVar08() {
        return var08;
    }

    public void setVar08(int var08) {
        this.var08 = var08;
    }

    public int getVar09() {
        return var09;
    }

    public void setVar09(int var09) {
        this.var09 = var09;
    }

    public void  mostrar_atributos() {
        System.out.println("{CLASSE C3} VARIAVEL DE C1 (SUPER)"+this.getVar01());
        System.out.println("{CLASSE C3} VARIAVEL DE C1 (SUPER)"+this.getVar02());
        System.out.println("{CLASSE C3} VARIAVEL DE C1 (SUPER)"+this.getVar03());

        System.out.println("{CLASSE C3} VARIAVEL DE C2 (SUPER)"+this.getVar04());
        System.out.println("{CLASSE C3} VARIAVEL DE C2 (SUPER)"+this.getVar05());
        System.out.println("{CLASSE C3} VARIAVEL DE C2 (SUPER)"+this.getVar06());

        System.out.println("{CLASSE C3} VARIAVEL DE C3 (SUPER)"+this.getVar07());
        System.out.println("{CLASSE C3} VARIAVEL DE C3 (SUPER)"+this.getVar08());
        System.out.println("{CLASSE C3} VARIAVEL DE C3 (SUPER)"+this.getVar09());
    }
    public void  mostrar_atributos_super() {
        System.out.println("{CLASSE C3} VARIAVEL DE C1 (SUPER)"+super.getVar01());
        System.out.println("{CLASSE C3} VARIAVEL DE C1 (SUPER)"+super.getVar02());
        System.out.println("{CLASSE C3} VARIAVEL DE C1 (SUPER)"+super.getVar03());

        System.out.println("{CLASSE C3} VARIAVEL DE C2 (SUPER)"+super.getVar04());
        System.out.println("{CLASSE C3} VARIAVEL DE C2 (SUPER)"+super.getVar05());
        System.out.println("{CLASSE C3} VARIAVEL DE C2 (SUPER)"+super.getVar06());

        System.out.println("{CLASSE C3} VARIAVEL DE C3 (SUPER)"+this.getVar07());
        System.out.println("{CLASSE C3} VARIAVEL DE C3 (SUPER)"+this.getVar08());
        System.out.println("{CLASSE C3} VARIAVEL DE C3 (SUPER)"+this.getVar09());
    }
}
