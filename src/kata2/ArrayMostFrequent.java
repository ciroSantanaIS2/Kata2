package kata2;

public class ArrayMostFrequent {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 1, 1, 1, 2, 2, 3, 1, 1, 2, 1};
        int[] frequencies = {0, 0, 0, 0, 0};
        
        for (int i = 0; i < elements.length; i++) {
            frequencies[elements[i] -1]++;
        }
        
        int number = 0;
        int times = 0;
        
        for (int i = 0; i < frequencies.length; i++) {
            if (frequencies[i] > times) {
                number = i+1;
                times = frequencies[i];
            }
        }
        
        System.out.println("El elemento que más veces se repite es el " + number + ", que se repite "
        + times + " veces.");
    }
    
}
