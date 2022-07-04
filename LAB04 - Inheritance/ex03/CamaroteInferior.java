public class CamaroteInferior extends Vip {
    private int localizacaoIngresso;

    public CamaroteInferior() {
    }

    public CamaroteInferior(int localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public int getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(int localizacaoIngresso) {
        this.localizacaoIngresso = this.localizacaoIngresso;
    }

    public void imprimeLocalizacaIngresso() {
    System.out.println("{Voce esta no camarote inferior} A Localizacao do seu ingresso eh: "+this.getLocalizacaoIngresso());
    }
}
