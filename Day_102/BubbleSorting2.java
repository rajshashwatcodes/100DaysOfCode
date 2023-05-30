public class BubbleSorting2 {
    public static void main(String[] args) {
        int arr[] = {5 , 4 , 1 , 3 , 2};
        bubbleSortFunc(arr);
        printArr(arr);
    }

    public static void printArr(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

    public static void bubbleSortFunc(int arr[]) {
        for(int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for(int j = 1; j < arr.length - i; j++) {
                if(arr[j] > arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
        }
    }
}
