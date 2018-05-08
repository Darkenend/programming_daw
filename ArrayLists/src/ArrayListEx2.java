import java.util.ArrayList;

/**
 * @author Álvaro Real
 * @author darkenend.net
 * @version 1.0.0
 */

public class ArrayListEx2 {
    /**
     * @param args Command line arguments
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 50; i++) {
            numbers.add(i);
        }
        for (Integer i:
                numbers
             ) {
            int nos=i;
            System.out.println();
        }
        for (Integer i:
                numbers
             ) {
            if (i % 2 == 0) {
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
