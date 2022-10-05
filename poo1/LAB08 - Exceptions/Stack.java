public class Stack {
    private Lista stack;

    public Stack() 
    {
        this.stack = new Lista();
    }

    public Stack(Lista lista) 
    {
        this.stack=lista;
    }

    public Lista getLista() 
    {
        return this.stack;
    }
    
    public void push(int num) 
    {
        this.stack.insert_pos(1, num);
    }
    public int size() 
    {
        return this.stack.size();
    }
    public void pop() 
    {
        this.stack.pop_front();
    }
    public int top() 
    {
        return this.stack.find_num(1);
    }
    public void print() 
    {
        this.stack.print();
    }
}
