public class CamaroteSuperior extends Vip {
    private int valorAdicional;
    private int localizacaoIngresso;

    public CamaroteSuperior() {
    }

    public CamaroteSuperior(int valorAdicional, int localizacaoIngresso) {
        this.valorAdicional = valorAdicional;
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public int getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(int valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public int getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(int localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public int valorIngresso() {
        this.setValor(this.getValor()+this.getValorAdicional());
        return getValor();
    }

    public void imprimeLocalizacaIngresso() {
        System.out.println("{Voce esta no camarote inferior} A Localizacao do seu ingresso eh: "+this.getLocalizacaoIngresso());
    }
}
