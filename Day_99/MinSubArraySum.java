public class MinSubArraySum {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            end = i;
            while (sum >= target) {
                min = Math.min(min, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }
        System.out.println(min);
    }
}
