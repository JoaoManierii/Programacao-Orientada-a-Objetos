import java.util.Scanner;

public class Main
{
    public static Scanner read = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Testes Iniciados");
        Lista lista_01 = new Lista();
        int  qtd=7;

        System.out.println("Lista criada");

        lista_01.print();
        
        for(int i =0;i<qtd;i++){
            lista_01.insert_sorted(i+1);

        }

        System.out.println("Valores salvo na lista");

        lista_01.print();

        System.out.println("erase_numr o 4");
        
        lista_01.erase_num(4);

        lista_01.print();

        System.out.println("Mover o 1 para o final");

        lista_01.push_back(1);

        lista_01.print();

        System.out.println("Mover o 5 para o começo");

        lista_01.push_front(5);

        lista_01.print();

        System.out.println("Inserindo valor na posição 2");

        lista_01.insert_pos(4, 8);

        lista_01.print();

        System.out.println("O tamanho da lista eh: "+ lista_01.size() + "\n");


        System.out.println("erase_num o ultimo elemento da lista");

        lista_01.pop_back();

        lista_01.print();

        System.out.println("erase_num o primeiro elemento da lista");

        lista_01.pop_front();

        lista_01.print();

        System.out.println("erase_num o elemento da posicao 3");

        lista_01.erase_pos(3);

        lista_01.print();

        System.out.println("Qual o elemento na posicao 3");


        System.out.println("O elemento na posição 3 eh: "+ lista_01.find_num(3) +"\n");

        lista_01.print();

        System.out.println("Qual a posição do elemento 7");


        System.out.println("O elemento esta na posicao: "+ lista_01.find_pos(7) +"\n");

        lista_01.print();


        System.out.println("O primeiro elemento da lista eh: "+ lista_01.getprimeiro() );

        System.out.println("O ultimo elemento da lista eh: "+ lista_01.getultimo() );


        lista_01.print();

        System.out.println("Apagar todos os dados ");

     
        lista_01.erase_data();

        lista_01.print();

        System.out.println("Testes finalizados");
        System.gc();
    }

}