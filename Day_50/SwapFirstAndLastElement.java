import java.util.Arrays;

public class SwapFirstAndLastElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Check if the array is empty or has only one element
        if (array.length <= 1) {
            System.out.println("Array has less than 2 elements. No swap is needed.");
        } else {
            // Swap the first and last elements using a temporary variable
            int temp = array[0];
            array[0] = array[array.length - 1];
            array[array.length - 1] = temp;

            // Print the modified array
            System.out.println("Original Array: " + Arrays.toString(array));
        }
    }
}
