public class Fila {
    private Lista fila;


    public Fila() 
    {
        this.fila = new Lista();
    }

    public Fila(Lista list) 
    {
        this.fila=list;
    }

    public Lista getFila() 
    {
        return this.fila;
    }

    public void setFila(Lista fila) 
    {
        this.fila = fila;
    }

    
    public void push(int num) 
    {
        this.fila.add_valor(num);
    }
    
    public int size() 
    {
        return this.fila.size();
    }
    
    public void pop() 
    {
        this.fila.pop_front();
    }
    
    public int front() 
    {
        return this.fila.find_num(1);
    }

    public void print() 
    {
        this.fila.print();
    }

}
