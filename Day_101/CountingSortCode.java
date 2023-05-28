public class CountingSortCode {
    public static void main(String[] args) {
        int arr[] = {5 , 4 , 1 , 3 , 2};
        countingSortFunc(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void countingSortFunc(int arr[]) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        int range = max - min + 1;
        int count[] = new int[range];
        for(int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for(int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        int output[] = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for(int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}
