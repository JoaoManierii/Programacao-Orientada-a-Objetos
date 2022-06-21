import java.util.Scanner;

public class Main
{
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args)
    {
        int opcao =0;
        
        while(opcao!=5)
        {
            
            System.out.println("Escolha uma opcao");
            System.out.println("01 = Lista");
            System.out.println("02 = Fila");
            System.out.println("03 = Stack");
            System.out.println("04 = Todas de uma so vez.");
            System.out.println("05 = Sair");
            
            opcao=scan.nextInt();
            if(opcao==1)
                Lista();
            else if(opcao==2)
                fila();
            else if(opcao==3)
                Pilha();
            else if(opcao==4)
                todas();
            else if(opcao==5)
                System.out.println("Voce escolheu sair");
            else 
                System.out.println("Escolha uma opcao valida");
        }
        scan.close();
    }

    public static void Lista()
    {
        System.out.println("Testes Iniciados");
        Lista L01 = new Lista();

        System.out.println("Lista criada");

        L01.print();
        
        L01.add_valor(1);
        L01.add_valor(2);
        L01.add_valor(3);
        L01.add_valor(4);
        L01.add_valor(5);
        L01.add_valor(6);
        L01.add_valor(7);
        L01.add_valor(8);
        L01.add_valor(9);
        L01.add_valor(10);

        System.out.println("Valores salvo na lista");

        L01.print();

        System.out.println("remover o 4");
        
        L01.remove(4);

        L01.print();

        System.out.println("Mover o 1 para o final");

        L01.push_back(1);

        L01.print();

        System.out.println("Mover o 5 para o começo");

        L01.push_front(5);

        L01.print();

        System.out.println("Inserindo valor na posição 2");

        L01.add_naPos(2, 11);

        L01.print();

        System.out.println("O tamanho da lista eh: "+ L01.size() + "\n");


        System.out.println("Remove o ultimo elemento da lista");

        L01.pop_back();

        L01.print();

        System.out.println("Remove o primeiro elemento da lista");

        L01.pop_front();

        L01.print();

        System.out.println("Remove o elemento da posicao 3");

        L01.remove_pos(3);

        L01.print();

        System.out.println("Qual o elemento na posicao 3");


        System.out.println("O elemento na posição 3 eh: "+ L01.find_num(3) +"\n");

        L01.print();

        System.out.println("Qual a posição do elemento 8");


        System.out.println("O elemento esta na posicao: "+ L01.find_pos(8) +"\n");

        L01.print();


        System.out.println("O primeiro elemento da lista eh: "+ L01.getFirst() );

        System.out.println("O ultimo elemento da lista eh: "+ L01.getLast() );


        L01.print();

        System.out.println("Apagar todos os dados ");

     
        L01.erase_data();

        L01.print();

        System.out.println("Testes finalizados");
        System.gc();
    }
    
    public static void Pilha()
    {

        System.out.println("Teste Iniciado");

        Stack pilha = new Stack();

        System.out.println("Stack criado");
    
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(40);

        System.out.println("Adicionadoo valores a pilha "); 


        System.out.println("Tamanho da pilha: "+ pilha.size());
        pilha.print();
        System.out.println("Remove o elemento do topo ");

        pilha.pop();

        System.out.println("Quem esta no topo da pilha eh: "+ pilha.top());

        System.out.println("Estado atual da pilha: ");

        pilha.print();

        System.out.println("Teste Finalizado. ");

    }

    public static void fila()
    {
        System.out.println("Teste Finalizado.");

        Fila fila = new Fila();
        
        System.out.println(" Fila criada ");

        fila.push(100);
        fila.push(200);
        fila.push(300);
        fila.push(400);
        fila.push(500);

        System.out.println("Valores adicionados ");

        fila.print();

        System.out.println("O tamanha da fila eh:"+ fila.size());

        System.out.println("Removendo o primeiro elemento da fila");

        fila.pop();

        fila.print();

        System.out.println("Quem esta a frente da fila eh: "+ fila.front());

        System.out.println("Valor 600 adicionado a fila");

        fila.push(600);

        fila.print();

        System.out.println("Status atual");

        fila.print();

        System.out.println("Fim dos testes");

    }

    public static void todas()
    {
        Lista();
        Pilha();
        fila();
    }

}