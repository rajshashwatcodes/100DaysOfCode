import java.util.ArrayList;
import java.util.List;

public class ListMeanCalculator {
    public static void main(String[] args) {
        // Create a list of numbers
        List<Double> numbers = new ArrayList<>();
        numbers.add(2.5);
        numbers.add(4.8);
        numbers.add(3.2);
        numbers.add(6.1);
        numbers.add(5.4);

        // Calculate the mean
        double mean = calculateMean(numbers);

        // Print the mean
        System.out.println("Mean: " + mean);
    }

    public static double calculateMean(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.size();
    }
}
