// To get the largest number in array
public class largestNumber {
    public static int largestNum(int numbers[]) {
        // for writing -infinity in java "Integer.MIN_VALUE" is used
        // for writing +infinity in java "Integer.MAX_VALUE" is used
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i < numbers.length ; i++){
            if(largest < numbers[i]) {
                // if "largest" is smaller than numbers[i], it will get updated to numbers[i]
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String args[]) {
        int numbers[] = {1 , 2, 6 , 3, 5};
        System.out.println("Largest value is: " + largestNum(numbers));
    }
}
