public class Kvizinhos implements Algoritmo{

    private int numVizinhos;
    private int medidaAprox;
    private String tipoTarefa;
    private State state;


    public Kvizinhos(int numVizinhos, int medidaAprox) {
        this.numVizinhos = numVizinhos;
        this.medidaAprox = medidaAprox;
        this.tipoTarefa = null;
        this.state = new UnfittedState(this);
    }


    public void imprimeModelo() {
        System.out.println("Kvizinhos{" +
                "numVizinhos=" + numVizinhos +
                ", medidaAprox=" + medidaAprox +
                ", tipoTarefa='" + tipoTarefa + '\'' +
                ", state=" + state +
                '}');
    }

    public void avaliaModelo(){

    }

    @Override
    public String fit() {
        return "Ajuste realizado!";
    }

    @Override
    public String predict() {
        return "Previsão realizada!";
    }

    public int getNumVizinhos() {
        return numVizinhos;
    }

    public void setNumVizinhos(int numVizinhos) {
        this.numVizinhos = numVizinhos;
    }

    public int getMedidaAprox() {
        return medidaAprox;
    }

    public void setMedidaAprox(int medidaAprox) {
        this.medidaAprox = medidaAprox;
    }

    public String getTipoTarefa() {
        return tipoTarefa;
    }

    public void setTipoTarefa(String tipoTarefa) {
        this.tipoTarefa = tipoTarefa;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
