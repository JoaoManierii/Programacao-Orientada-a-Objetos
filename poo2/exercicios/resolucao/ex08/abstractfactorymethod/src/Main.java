public class Main {
    public static void main(String[] args) {
        System.out.println("Maquina ");


        Quiosque refrigerante = (Quiosque) MaquinaCocaColaCompany.entregarRefrigerante();
        Quiosque suco = (Quiosque) MaquinaCocaColaCompany.entregarSuco();

        System.out.println(refrigerante.pegarRefri());
        System.out.println(suco.pegarSuco());

        Quiosque refrigerantee = (Quiosque) MaquinaAmbev.entregarRefrigerante();
        Quiosque sucoo = (Quiosque) MaquinaAmbev.entregarSuco();

        System.out.println(refrigerantee.pegarRefri());
        System.out.println(sucoo.pegarSuco());
        /*
         Responda:
            5) Um novo tipo de bebida é distribuído: Água. O que deve ser feito no código?
            Devera ser implementado ao codigo a interface IAgua, implementando elas as respectivas empresas que fossem
            comercializar a mesma.
            6) Uma nova empresa de bebidas entrou no mercado e produz apenas sucos. O que deve ser feito no código?
            Criar uma nova classe para essa empresa e uma classe para o nome desse respectivo suco, implementando tambem
            a essa classe o metodo ISuco, para que funcione na classe quiosque.
            7) A empresa Coca-Cola Company passou a produzir o refrigerante Coca Cola Zero. O que deve ser feito no código?
            Criar a Classe "CocaColaZero" extendendo a classe MaquinaCocaColaCompany e implementando a ela a classe refrigerante
         */
    }
}
