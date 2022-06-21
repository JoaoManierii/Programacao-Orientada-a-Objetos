public class Lista {
    
    private No primeiro;
    private No ultimo;
    private int tam =0;

    public Lista()
    {
        this.primeiro=null;
        this.ultimo=primeiro;
    }

    public int getprimeiro() {
        No primeiro = primeiro.getNext();
        return primeiro.getNum();
    }

    public int getultimo() {
        
        
        
        return this.ultimo.getNum();
    }


    public void add_valor(int num) 
        if(primeiro==null) 
        {
            primeiro = new No();
            ultimo = primeiro;
            No N = new No();
            N.setNum(num);
            N.setNext(null);
            ultimo.setNext(N);
            ultimo = N;
            tam++;
        }
        else 
        {
            No N = new No();
            N.setNum(num);
            N.setNext(null);
            ultimo.setNext(N);
            ultimo = N;
            tam++;
        }
    }

    public void add_naPos(int pos, int num) 
    {
        if(pos>this.tam) 
        {
            System.out.println("A Lista possui "+ this.tam + "Elementos");
            add_valor(num);
            System.out.println("O tamanho da lista agora e "+ this.tam);
        }
        
        else if(pos==size()) 
        {
            No novo = new No(num);
            if(pos==1)
            {   
                novo.setNext(primeiro.getNext());
                primeiro.setNext(novo);
                this.tam++;
            }
            else
            {
               
                ultimo=novo;
                this.tam++;
            }
        }
        else if(pos==1)
        {
            No novo = new No(num);
            novo.setNext(primeiro.getNext());
            primeiro.setNext(novo);
            this.tam++;
        }

        else if(pos>1) 
        {
            No percorre = primeiro.getNext();
            No Sentinela = primeiro;
            
            for(int i=1; i<size();i++)
                if(i==pos)
                {
                    No novo = new No(num);
                    novo.setNext(Sentinela.getNext());
                    Sentinela.setNext(novo);
                    tam++;
                    break;
                }
                else
                {
                    percorre = percorre.getNext();
                    Sentinela = Sentinela.getNext();       
                }
        }
}
    

    public void print() 
    {
        
        
        if(this.primeiro==null) 
            System.out.println(" A Lista não possui nenhum elemento");
        
        else 
        {
            No per = primeiro.getNext();
        
            while(per != null)
            {
                System.out.println(per.getNum());
                per=per.getNext();
            }
        }
    }

    public void remove(int num) 
    {
        No per = primeiro.getNext();
        No Sent = primeiro;
        
        if(primeiro==null)  
            System.out.println("A Lista não possui nenhum elemento");
            
        else while(per != null) 
        {
            if (per.getNum() == num) 
            {
                if(per.getNext()==null) /
                {
                    ultimo=Sent;
                    ultimo.setNext(null);
                    per=null;
                    tam--;
                    break;
                }
                else 
                {
                    Sent.setNext(per.getNext());
                    per.setNext(null);
                    per = null;
                    tam--;
                    break;
                }
            }
            per = per.getNext();
            Sent = Sent.getNext();
            
        }
        System.gc();
    }

    public void remove_pos(int pos) 
    {
        No per = primeiro.getNext();
        No Sent = primeiro;
        
        if(primeiro==null)  
            System.out.println("A Lista não possui nenhum elemento");

        if(pos>this.tam) 
            System.out.println("A Lista possui "+ this.tam +"elementos a posição "+ pos + "não existe");
            
        else for(int i=1;i<this.tam;i++) 
        {
            if(i==pos)
                {
                    Sent.setNext(per.getNext());
                    per.setNext(null);
                    per = null;
                    break;
                }
            per = per.getNext();
            Sent = Sent.getNext();
            
        }
        System.gc();
    }
    
    public int size() 
    {
        return tam;
    }

    public void erase_data()
    {
        No percorre = primeiro.getNext();
        No Sentinela = primeiro;
        
        if(primeiro==null) 
            System.out.println("A Lista não possui nenhum elemento");
            
        else while(percorre != null) 
        {
            Sentinela.setNext(null);
            Sentinela = null;
            Sentinela = percorre;
            percorre = percorre.getNext();
        }
        this.primeiro=null;
        this.ultimo=primeiro;
        System.gc();
    }
    
    public void push_front(int num) 
    {
        No per = primeiro.getNext();
        No Sent = primeiro;
        
        if(primeiro==null)
            System.out.println("A Lista não possui nenhum elemento");
            
        else while(per != null) 
        {
            if (per.getNum() == num) 
            {
                if(per.getNext()==null) 
                {
                    ultimo=Sent;
                    ultimo.setNext(null);
                    per.setNext(primeiro.getNext());
                    primeiro.setNext(per);
                    break;
                }
                else 
                {
                    ultimo=Sent;
                    ultimo.setNext(per.getNext());
                    per.setNext(primeiro.getNext());
                    primeiro.setNext(per);
                    break;
                }
            }
            per = per.getNext();
            Sent = Sent.getNext();
        }
    }
    
    public void push_back(int num) 
    {
        No per = primeiro.getNext();
        No Sent = primeiro;
        
        if(primeiro==null)  
            System.out.println("A Lista não possui nenhum elemento");
        
        else if (this.tam==1)
            {
                if(primeiro.getNum()==num)
                {
                    System.out.println("O elemento eh o unico na lista. ");
                }
                else 
                    System.out.println("A Lista não possui esse elemento ");
            }
            
        else while(per != null) 
        {
            if (per.getNum() == num) 
            {
                if(per.getNext()==null) 
                {
                    System.out.println("Nenhuma alteracao foi feita, o elemente e o ultimo da lista. ");
                    break;
                }
                else 
                {
                    primeiro.setNext(per.getNext());
                    ultimo.setNext(per);
                    per.setNext(null);
                    ultimo=per;
                    break;
                }
            }
            per = per.getNext();
            Sent = Sent.getNext();
        }
    }

    public void pop_front() 
    {
        if(this.primeiro == null) 
        {
            System.out.println("A Lista não possui nenhum elemento");
        }
        else 
        {
            No percorre = primeiro.getNext();
            if(percorre.getNext()==null) 
            {
                this.primeiro.setNext(null);
                this.ultimo=primeiro;
                this.tam--;
            }
            else 
            {
                primeiro.setNext(percorre.getNext());
                percorre.setNext(null);
                percorre=null;
                this.tam--;
            }
        }
        
    }

    public void pop_back()
    {
        if(this.primeiro == null) 
        {
            System.out.println("A Lista não possui elementos");
        }
        else
        {
            No percorre = primeiro.getNext();
            if(percorre.getNext()==null)
            {
                this.primeiro.setNext(null);
                this.ultimo=primeiro;
                this.tam--;
            }
            else
            {
                No sentinela = primeiro;
                int temp = this.tam;
                while(temp!=0)
                {
                    temp--;
                    if(temp==0)
                    {
                        sentinela.setNext(null);
                        ultimo=sentinela;
                        percorre=null;
                        this.tam--;
                        break;
                    }
                    percorre = percorre.getNext();
                    sentinela = sentinela.getNext();
                    
                }

            }
        }
    }

    public int find_pos(int num)
    {
        if(this.primeiro == null) 
        {
            System.out.println("A Lista não possui nenhum elemento");
        }
        else
        {
            No percorre = primeiro.getNext();
            for(int i =0;i<size();i++)
            {    if(percorre.getNum()==num)
                    return i+1;
                percorre=percorre.getNext();
            }
        }
        System.out.println("Valor não encontrado ");
        return -1;
    }

    public int find_num(int pos)
    {
        if(this.primeiro == null) 
        {
            System.out.println("A Lista não possui elementos");
        }
        else
        {
            No percorre = primeiro.getNext();
            for(int i =1;i<size();i++)
            {
                if(i==pos)
                    return percorre.getNum();
                percorre=percorre.getNext();
            }
        }
        System.out.println("Valor não encontrado");
        return -1;
    }
}
    



