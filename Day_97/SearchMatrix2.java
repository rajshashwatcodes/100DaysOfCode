public class SearchMatrix2 {
    public static void main(String[] args) {
        int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 } };
        int target = 3;
        int row = matrix.length;
        int col = matrix[0].length;
        int start = 0;
        int end = row * col - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = matrix[mid / col][mid % col];
            if (midVal == target) {
                System.out.println("Found");
                return;
            } else if (midVal < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        System.out.println("Not Found");
    }
}
