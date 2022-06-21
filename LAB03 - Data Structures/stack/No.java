public class No {
    
    private int numero;
    private No next;

    public No()
    {
    }
    public No(int numero)
    {
        this.numero=numero;
        this.next=null;
    }
    
    public int getnumero()
    {
        return this.numero;
    }

    public void setnumero(int numero)
    {
        this.numero=numero;
    }
    public No getnext()
    {
        return this.next;
    }
    public void setnext(No next)
    {
        this.next=next;
    }
    
}
