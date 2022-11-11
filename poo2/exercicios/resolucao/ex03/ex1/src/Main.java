import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
    public static void main(String[] args)
    {
        long inicio = System.currentTimeMillis();
        Primos lista = new Primos(0,9999);
        ExecutorService x = Executors.newFixedThreadPool(1);
        x.execute(lista);
        x.shutdown();
    }
}