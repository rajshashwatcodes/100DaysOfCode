public class MaxSubArraySum {

    public static void maxSubArraySum(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];

        prefix[0] = numbers[0];

        // calculate prefix sum
        for(int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + numbers[i];
        }

        for(int i = 0; i < numbers.length; i++) {
            int start = i;
            for(int j = i; j < numbers.length; j++) {
                int end = j;
                currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];

                if(maxSum  < currentSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }
    public static void main(String args[]) {
        int numbers[] = {1 , -2 , 6 , -1 , 3};
        maxSubArraySum(numbers);
    }
}
