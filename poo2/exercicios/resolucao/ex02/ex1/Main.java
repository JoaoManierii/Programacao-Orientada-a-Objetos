public class Main {
    public static <T> void imprimeArray(T[] inputArray){
        for (T element :inputArray)
            System.out.printf("%s", element);
        System.out.println();
    }
    public static void main(String[] args) {


        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
        Character[] charArray = {'H','E','L','L','O'};

        imprimeArray(intArray);
        imprimeArray(doubleArray);
        imprimeArray(charArray);

    }

}