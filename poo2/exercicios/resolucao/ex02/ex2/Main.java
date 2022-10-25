public class Main {
    public static <T> void imprimeArray(T[] inputArray){
        for (T element :inputArray)
            System.out.printf("%s", element);
        System.out.println();
    }

    public static <T extends Comparable<T>> T maiorValor(T elem1, T elem2, T elem3) {
        if(elem1.compareTo( elem2)>0)
        {
            if(elem1.compareTo( elem3)>0)
            {
                return elem1;
            }else return elem3;
        }else if(elem2.compareTo( elem3)>0)
            return elem2;
        else return elem3;
    }
    public static void main(String[] args) {


        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Float[] floatArray = {1.1f,2.2f,3.3f,4.4f,5.5f};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println(maiorValor(1,2,3));
        System.out.println(maiorValor(1.1f,2.2f,3.3f));
        System.out.println(maiorValor(1.1,2.2,3.3));

        /*imprimeArray(intArray);
        imprimeArray(doubleArray);
        imprimeArray(charArray);*/



} }