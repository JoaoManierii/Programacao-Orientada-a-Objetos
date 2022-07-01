public class C1 {
    public int var01;
    protected int var02;
    private int var03;

    public int getVar01() {
        return var01;
    }

    public void setVar01(int var01) {
        this.var01 = var01;
    }

    public int getVar02() {
        return var02;
    }

    public void setVar02(int var02) {
        this.var02 = var02;
    }

    public int getVar03() {
        return var03;
    }

    public void setVar03(int var03) {
        this.var03 = var03;
    }

    public C1() {
        System.out.println("{CLASSE C1} Classe C1: chamada do construtor padrao, SEM parametros");
    }

    public C1(int var01, int var02, int var03) {
        this.var01 = var01;
        this.var02 = var02;
        this.var03 = var03;
        System.out.println("{CLASSE C1} Classe C1: chamada do construtor padrao, COM parametros {CLASSE C1}");
    }

   public void  mostrar_atributos() {
       System.out.println("{CLASSE C1} VARIAVEL DE C1 "+this.getVar01());
       System.out.println("{CLASSE C1} VARIAVEL DE C1 "+this.getVar02());
       System.out.println("{CLASSE C1} VARIAVEL DE C1 "+this.getVar03());
    }

    public void  mostrar_atributos_super() {
        System.out.println("{CLASSE C1} VARIAVEL DE C1  (SUPER)"+this.getVar01());
        System.out.println("{CLASSE C1} VARIAVEL DE C1  (SUPER)"+this.getVar02());
        System.out.println("{CLASSE C1} VARIAVEL DE C1  (SUPER)"+this.getVar03());
    }
}
