import java.util.Random;

public class FittedState implements State{

    public Arvore arvore;
    public RedeNeural redeNeural;
    public Kvizinhos kvizinhos;



    FittedState(Arvore arvore) {
        this.arvore=arvore;
        // alterações
    }

    FittedState(RedeNeural redeNeural) {
        this.redeNeural=redeNeural;
        // alterações
    }

    FittedState(Kvizinhos kvizinhos) {
        this.kvizinhos=kvizinhos;
        // alterações
    }

        @Override
        public String Onfit(Arvore arvore) {
            return "Impossível realizar fit, algoritmo já ajustado";
        }

        @Override
        public String Onfit(Kvizinhos kvizinhos) {
            return "Impossível realizar fit, algoritmo já ajustado";
        }

        @Override
        public String Onfit(RedeNeural redeNeural) {
            return "Impossível realizar fit, algoritmo já ajustado";
        }

        @Override
        public String Onpredict(Arvore arvore) {
            Random gerador = new Random();
            int resultado = gerador.nextInt(3);
            if(resultado==1){
                this.arvore.setState(new UnfittedState(this.arvore));
                return "Predict insatisfatório, realize o ajuste novamente";
            }
            else if(resultado==2){
                this.arvore.setState(new IterFitState(this.arvore));
                return "Predict regular, algoritmo mudado para IterFit";
            }
            else{
                return "Predict bom, permanece no Fitted";
            }

        }

        @Override
        public String Onpredict(Kvizinhos kvizinhos) {
            Random gerador = new Random();
            int resultado = gerador.nextInt(3);
            if(resultado==1){
                this.kvizinhos.setState(new UnfittedState(this.kvizinhos));
                return "Predict insatisfatório, realize o ajuste novamente";
            }
            else if(resultado==2){
                this.kvizinhos.setState(new IterFitState(this.kvizinhos));
                return "Predict regular, algoritmo mudado para IterFit";
            }
            else{
                return "Predict bom, permanece no Fitted";
            }
        }

        @Override
        public String Onpredict(RedeNeural redeNeural) {
            Random gerador = new Random();
            int resultado = gerador.nextInt(3);
            if(resultado==1){
                this.redeNeural.setState(new UnfittedState(this.redeNeural));
                return "Predict insatisfatório, realize o ajuste novamente";
            }
            else if(resultado==2){
                this.redeNeural.setState(new IterFitState(this.redeNeural));
                return "Predict regular, algoritmo mudado para IterFit";
            }
            else{
                return "Predict bom, permanece no Fitted";
            }
        }

    @Override
    public String toString() {
        return "FittedState";
    }


    //métodos
}
