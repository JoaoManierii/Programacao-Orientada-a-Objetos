public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Teste Finalizado.");

        Fila fila = new Fila();
        
        System.out.println(" Fila criada ");

        for(int i =0;i<qtd;i++){
            fila.push(i+1);

        }

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
        System.gc();
    }

}