public class InsertionSorting {
    public static void main(String[] args) {
        int arr[] = {5 , 4 , 1 , 3 , 2};
        insertionSortFunc(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSortFunc(int arr[]) {
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // at this point we've exited, so j is either -1
            // or it's at the first element where current >= a[j]
            arr[j + 1] = current;
        }
    }
}
