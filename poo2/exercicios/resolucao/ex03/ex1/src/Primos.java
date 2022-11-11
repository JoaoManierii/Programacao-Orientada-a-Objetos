public class Primos implements Runnable{
    private int min;
    private int max;


    public Primos(int mim, int max) {
        this.min = mim;
        this.max = max;
    }
    public boolean Primo(int e)
    {
        for(int i =2 ; i < e/2+1;i++)
        {
            if(e%i==0)
                return false;
        }
        return true;
    }

    public void run()
    {
        long inicio = System.currentTimeMillis();
        for(int i = min;i <=max;i++)
        {
            if(Primo(i))
                System.out.println("Numero Primo: " +i);
        }
        System.out.println();
        System.out.println("Minimo: " + min + " Maximo: "+ max+" Tempo Execucao: "+ (System.currentTimeMillis() - inicio) +" Milesegundos");
    }
}