public class No {
    
    private int numero;
    private No next;

    public No()
    {
    }
    public No(int numero)
    {
        this.numero=numero;
        next=null;
    }
    
    public int getnumero()
    {
        return numero;
    }

    public void setnumero(int numero)
    {
        this.numero=numero;
    }
    public No getnext()
    {
        return next;
    }
    public void setnext(No next)
    {
        this.next=next;
    }
    
}
