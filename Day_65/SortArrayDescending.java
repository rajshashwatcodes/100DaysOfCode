import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayDescending {
    public static void main(String[] args) {
        Integer[] array = {5, 1, 4, 2, 8};

        // Using a custom Comparator to sort in descending order
        Arrays.sort(array, Collections.reverseOrder());

        // Printing the sorted array in descending order
        System.out.println("Array in Descending Order: " + Arrays.toString(array));
    }
}
