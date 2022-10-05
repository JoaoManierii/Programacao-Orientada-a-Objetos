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
        No primeiro = this.primeiro.getnext();
        return primeiro.getnumero();
    }

    public int getultimo() {
        
        
        
        return this.ultimo.getnumero();
    }

    public void insert_sorted(int numero){   
        if(primeiro==null) 
        {
            primeiro = new No();
            ultimo = primeiro;
            No N = new No();
            N.setnumero(numero);
            N.setnext(null);
            ultimo.setnext(N);
            ultimo = N;
            tam++;
        }
        else 
        {
            No N = new No();
            N.setnumero(numero);
            N.setnext(null);
            ultimo.setnext(N);
            ultimo = N;
            tam++;
        }
    }

    public void insert_pos(int pos, int num) 
    {
        if(pos>this.tam) 
        {
            System.out.println("A Lista possui "+ this.tam + "Elementos");
            insert_sorted(num);
            System.out.println("O tamanho da lista agora e "+ this.tam);
        }
        
        else if(pos==size()) 
        {
            No novo = new No(num);
            if(pos==1)
            {   
                novo.setnext(primeiro.getnext());
                primeiro.setnext(novo);
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
            novo.setnext(primeiro.getnext());
            primeiro.setnext(novo);
            this.tam++;
        }

        else if(pos>1) 
        {
            No percorre = primeiro.getnext();
            No Sentinela = primeiro;
            
            for(int i=1; i<size();i++)
                if(i==pos)
                {
                    No novo = new No(num);
                    novo.setnext(Sentinela.getnext());
                    Sentinela.setnext(novo);
                    tam++;
                    break;
                }
                else
                {
                    percorre = percorre.getnext();
                    Sentinela = Sentinela.getnext();       
                }
        }
}
    
    public void print() 
    {
        
        
        if(this.primeiro==null) 
            System.out.println(" A Lista não possui nenhum elemento");
        
        else 
        {
            No per = primeiro.getnext();
        
            while(per != null)
            {
                System.out.println(per.getnumero());
                per=per.getnext();
            }
        }
    }

    public void erase_num(int num) 
    {
        No per = primeiro.getnext();
        No Sent = primeiro;
        
        if(primeiro==null)  
            System.out.println("A Lista não possui nenhum elemento");
            
        else while(per != null) 
        {
            if (per.getnumero() == num) 
            {
                if(per.getnext()==null) 
                {
                    ultimo=Sent;
                    ultimo.setnext(null);
                    per=null;
                    tam--;
                    break;
                }
                else 
                {
                    Sent.setnext(per.getnext());
                    per.setnext(null);
                    per = null;
                    tam--;
                    break;
                }
            }
            per = per.getnext();
            Sent = Sent.getnext();
            
        }
        System.gc();
    }

    public void erase_pos(int pos) 
    {
        No per = primeiro.getnext();
        No Sent = primeiro;
        
        if(primeiro==null)  
            System.out.println("A Lista não possui nenhum elemento");

        if(pos>this.tam) 
            System.out.println("A Lista possui "+ this.tam +"elementos a posição "+ pos + "não existe");
            
        else for(int i=1;i<this.tam;i++) 
        {
            if(i==pos)
                {
                    Sent.setnext(per.getnext());
                    per.setnext(null);
                    per = null;
                    break;
                }
            per = per.getnext();
            Sent = Sent.getnext();
            
        }
        System.gc();
    }
    
    public int size() 
    {
        return tam;
    }

    public void erase_data()
    {
        No percorre = primeiro.getnext();
        No Sentinela = primeiro;
        
        if(primeiro==null) 
            System.out.println("A Lista não possui nenhum elemento");
            
        else while(percorre != null) 
        {
            Sentinela.setnext(null);
            Sentinela = null;
            Sentinela = percorre;
            percorre = percorre.getnext();
        }
        this.primeiro=null;
        this.ultimo=primeiro;
        System.gc();
    }
    
    public void push_front(int num) 
    {
        No per = primeiro.getnext();
        No Sent = primeiro;
        
        if(primeiro==null)
            System.out.println("A Lista não possui nenhum elemento");
            
        else while(per != null) 
        {
            if (per.getnumero() == num) 
            {
                if(per.getnext()==null) 
                {
                    ultimo=Sent;
                    ultimo.setnext(null);
                    per.setnext(primeiro.getnext());
                    primeiro.setnext(per);
                    break;
                }
                else 
                {
                    ultimo=Sent;
                    ultimo.setnext(per.getnext());
                    per.setnext(primeiro.getnext());
                    primeiro.setnext(per);
                    break;
                }
            }
            per = per.getnext();
            Sent = Sent.getnext();
        }
    }
    
    public void push_back(int num) 
    {
        No per = primeiro.getnext();
        No Sent = primeiro;
        
        if(primeiro==null)  
            System.out.println("A Lista não possui nenhum elemento");
        
        else if (this.tam==1)
            {
                if(primeiro.getnumero()==num)
                {
                    System.out.println("O elemento eh o unico na lista. ");
                }
                else 
                    System.out.println("A Lista não possui esse elemento ");
            }
            
        else while(per != null) 
        {
            if (per.getnumero() == num) 
            {
                if(per.getnext()==null) 
                {
                    System.out.println("Nenhuma alteracao foi feita, o elemente e o ultimo da lista. ");
                    break;
                }
                else 
                {
                    primeiro.setnext(per.getnext());
                    ultimo.setnext(per);
                    per.setnext(null);
                    ultimo=per;
                    break;
                }
            }
            per = per.getnext();
            Sent = Sent.getnext();
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
            No percorre = primeiro.getnext();
            if(percorre.getnext()==null) 
            {
                this.primeiro.setnext(null);
                this.ultimo=primeiro;
                this.tam--;
            }
            else 
            {
                primeiro.setnext(percorre.getnext());
                percorre.setnext(null);
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
            No percorre = primeiro.getnext();
            if(percorre.getnext()==null)
            {
                this.primeiro.setnext(null);
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
                        sentinela.setnext(null);
                        ultimo=sentinela;
                        percorre=null;
                        this.tam--;
                        break;
                    }
                    percorre = percorre.getnext();
                    sentinela = sentinela.getnext();
                    
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
            No percorre = primeiro.getnext();
            for(int i =0;i<size();i++)
            {    if(percorre.getnumero()==num)
                    return i+1;
                percorre=percorre.getnext();
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
            No percorre = primeiro.getnext();
            for(int i =1;i<size();i++)
            {
                if(i==pos)
                    return percorre.getnumero();
                percorre=percorre.getnext();
            }
        }
        System.out.println("Valor não encontrado");
        return -1;
    }
}
    



