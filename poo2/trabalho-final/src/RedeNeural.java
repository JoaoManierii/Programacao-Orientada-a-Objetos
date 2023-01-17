public class RedeNeural implements Algoritmo{

    private State state;
    private int numCamadas;
    private int numNeuronioCamada;
    //Função de ativação??
    private float taxaAprendizado;
    private String tipoTarefa;
    @Override
    public String fit() {
        return "Ajuste realizado!";
    }

    @Override
    public String predict() {
        return "Previsão realizada!";
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getNumCamadas() {
        return numCamadas;
    }

    public void setNumCamadas(int numCamadas) {
        this.numCamadas = numCamadas;
    }

    public int getNumNeuronioCamada() {
        return numNeuronioCamada;
    }

    public void setNumNeuronioCamada(int numNeuronioCamada) {
        this.numNeuronioCamada = numNeuronioCamada;
    }

    public float getTaxaAprendizado() {
        return taxaAprendizado;
    }

    public void setTaxaAprendizado(float taxaAprendizado) {
        this.taxaAprendizado = taxaAprendizado;
    }

    public String getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(String tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }
}
