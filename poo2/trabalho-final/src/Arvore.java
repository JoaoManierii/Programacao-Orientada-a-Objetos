public class Arvore implements Algoritmo{

    private State state;
    private int numArv;
    private int medidaInform;
    private String tipoTarefa;

    public Arvore(int numArv, int medidaInform) {
        this.state = new UnfittedState(this);
        this.numArv = numArv;
        this.medidaInform = medidaInform;
        this.tipoTarefa = null;
    }

    @Override
    public String fit() {
        return "Ajuste realizado!";
    }

    @Override
    public String predict() {
        return "Previsão realizada!";
    }


    public void imprimeModelo() {
        System.out.println("Arvore{" +
                "state=" + state +
                ", numArv=" + numArv +
                ", medidaInform=" + medidaInform  +
                ", tipoTarefa='" + tipoTarefa + '\'' +
                '}');
    }

    public void avaliaModelo(){
        int sucessoArv = 2*numArv;
        int sucessoMedid = 2*medidaInform;

        while(true) {
            while (this.getState() instanceof UnfittedState){
                System.out.println(this.getState().Onfit(this));
                this.imprimeModelo();
            }
            String x = this.getState().Onpredict(this);
            this.imprimeModelo();
            if(x.equals("Predict bom, permanece no Fitted")){
                System.out.println("Algoritmo ajustado e funcionando perfeitamente");
                break;
            }
            else{
                System.out.println("Continuando algoritmo");
            }
        }

    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumArv() {
        return numArv;
    }

    public void setNumArv(int numArv) {
        this.numArv = numArv;
    }

    public int getMedidaInform() {
        return medidaInform;
    }

    public void setMedidaInform(int medidaInform) {
        this.medidaInform = medidaInform;
    }

    public String getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(String tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }
}
