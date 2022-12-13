public class binarySearch {

    public static int searchBinary(int numbers[] , int key) {
        int start = 0 , end = numbers.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;

            // comparison
            if(numbers[mid] == key) { // found
                return mid;
            }
            if(numbers[mid] < key) { // right
                start = mid + 1;
            }
            else { //left
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int numbers[] = {2 , 4 , 6 , 8 , 10 , 12 , 14};
        int key = 10;
        System.out.println("Index for key is: " + searchBinary(numbers, key));
    }
}
