package kata2;

import java.util.ArrayList;

public class ArrayListMostFrequent {

    public static void main(String[] args) {
        int[] elements = {1, 2, 3, 4, 5, 1, 1, 1, 2, 2, 3, 1, 1, 2, 1};
        ArrayList<Integer> frequencies = new ArrayList<>();
        
        for (int i = 0; i < elements.length; i++) {
            Integer frequency;
            
            try {
                frequency = frequencies.get(elements[i]);
            } catch (IndexOutOfBoundsException e) {
                frequency = 0;
            }
            
            try{
                frequencies.add(elements[i], frequency+1);
            }
            catch (IndexOutOfBoundsException e) {
                for (int j = frequencies.size(); j < elements[i]; j++) {
                    frequencies.add(j, 0);
                }
                frequencies.add(elements[i], frequency+1);
            }
            
        }
        
        int number = 0;
        int times = 0;
        
        for (int i = 0; i < frequencies.size(); i++) {
            if (frequencies.get(i) > times) {
                number = i;
                times = frequencies.get(i);
            }
            
        }
        
        System.out.println("El elemento que más veces se repite es el " + number + ", que se repite "
        + times + " veces.");
    }
}
