public class Vape {
    String marca;
    String modelo;
    float potencia;
    int tamanho_tanque;

    void status() {
        System.out.println("A marca do vape eh: "+this.marca);
        System.out.println("O modelo do vape eh: "+this.modelo);
        System.out.println("A potencia do vape eh: "+this.potencia);
        System.out.println("O tamanho do tanque eh: "+this.tamanho_tanque);
    }

    void tanque() {
        if (this.tamanho_tanque >= 10){
            System.out.println("O tanque ta cheio pae, pode carburar. Carga em: "+this.tamanho_tanque+"%");
        } else {
            System.out.println("Recarrega isso ai se nao vai queimar a coil ");
        }
    }
}


