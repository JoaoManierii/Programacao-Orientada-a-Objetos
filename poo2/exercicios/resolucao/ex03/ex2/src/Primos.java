public class Primos implements Runnable{
    private int min;
    private int max;

    public Primos(int x, int y){
        min = x;
        max = y;
    }
    public boolean primo(int x){
        for(int i=2; i<x/2+1;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
    public void run(){
        long inicio = System.currentTimeMillis();
        for(int i=min; i<=max;i++) {
            if (primo(i)) {
                System.out.println(i);
            }
        }
        System.out.println();
        System.out.println("Minimo: " + min + " Maximo: "+ max+" Tempo Execucao: "+ (System.currentTimeMillis() - inicio) +" Milesegundos");
    }
}