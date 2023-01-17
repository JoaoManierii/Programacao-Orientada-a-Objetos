public interface State {



    public String Onfit(Arvore arvore);
    public String Onfit(Kvizinhos kvizinhos);
    public String Onfit(RedeNeural redeNeural);

    public String Onpredict(Arvore arvore);
    public String Onpredict(Kvizinhos kvizinhos);
    public String Onpredict(RedeNeural redeNeural);
}
