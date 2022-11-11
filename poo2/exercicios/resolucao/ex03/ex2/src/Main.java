import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Main {
    public static void main(String args[]){
        
        Primos p1 = new Primos(1, 1000);
        Primos p2 = new Primos(1001, 2000);
        Primos p3 = new Primos(2001, 3000);
        Primos p4 = new Primos(3001, 4000);
        Primos p5 = new Primos(4001, 5000);
        Primos p6 = new Primos(5001, 6000);
        Primos p7 = new Primos(6001, 7000);
        Primos p8 = new Primos(7001, 8000);
        Primos p9 = new Primos(8001, 9000);
        Primos p10 = new Primos(9001, 9999);

        System.out.println("Comecando as threads");
        ExecutorService threadExecutor = Executors.newFixedThreadPool(10);


        threadExecutor.execute(p1);
        threadExecutor.execute(p2);
        threadExecutor.execute(p3);
        threadExecutor.execute(p4);
        threadExecutor.execute(p5);
        threadExecutor.execute(p6);
        threadExecutor.execute(p7);
        threadExecutor.execute(p8);
        threadExecutor.execute(p9);
        threadExecutor.execute(p10);

        threadExecutor.shutdown();
    }
}