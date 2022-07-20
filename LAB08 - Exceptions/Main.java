public class Main
{
    public static void main(String[] args)
    {
    
            Stack pilha = new Stack();
    
        
            for(int i =0;i<qtd;i++){
            pilha.push(i+1);
    
            }
    
            System.out.println("Adicionado valores a pilha "); 
    
    
            System.out.println("Tamanho da pilha: "+ pilha.size());
            pilha.print();
            System.out.println("Remove o elemento do topo ");
    
            pilha.pop();
    
            System.out.println("Quem esta no topo da pilha eh: "+ pilha.top());
    
            System.out.println("Estado atual da pilha: ");
    
            pilha.print();
    
    
   
}
}