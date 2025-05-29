import java.util.Arrays;
import java.util.Collections;

	public class SortingArray1 {
    public static void main(String[] args) {

        Integer[] numbers = {9, 7, 1, 5, 2};


        
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
        System.out.println("Descending: " + Arrays.toString(numbers));
    }
}