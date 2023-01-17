public class UnfittedState implements State{

    public Arvore arvore;
    public RedeNeural redeNeural;
    public Kvizinhos kvizinhos;


    UnfittedState(Arvore arvore) {
        this.arvore=arvore;
        // alterações
    }

    UnfittedState(RedeNeural redeNeural) {
        this.redeNeural=redeNeural;
        // alterações
    }

    UnfittedState(Kvizinhos kvizinhos) {
        this.redeNeural=redeNeural;
        // alterações
    }

    @Override
    public String Onfit(Arvore arvore) {
        this.arvore.setState(new FittedState(this.arvore));
        return this.arvore.fit();
    }

    @Override
    public String Onfit(Kvizinhos kvizinhos) {
        this.kvizinhos.setState(new FittedState(this.kvizinhos));
        return this.kvizinhos.fit();
    }

    @Override
    public String Onfit(RedeNeural redeNeural) {
        this.redeNeural.setState(new FittedState(this.redeNeural));
        return this.redeNeural.fit();
    }

    @Override
    public String Onpredict(Arvore arvore) {
        return "Impossível realizar predict, método não está ajustado";
    }

    @Override
    public String Onpredict(Kvizinhos kvizinhos) {
        return "Impossível realizar predict, método não está ajustado";
    }

    @Override
    public String Onpredict(RedeNeural redeNeural) {
        return "Impossível realizar predict, método não está ajustado";
    }

    @Override
    public String toString() {
        return "UnfittedState";
    }

    //métodos
}
