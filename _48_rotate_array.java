package leetcode;

public class _48_rotate_array {
    public static void rotateArray(int [][]matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        // Transpose
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            rotate(matrix[i]);
        }

        display(matrix);
    }

    public static void display(int [][] arr) {
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static int[] rotate(int [] arr) {
        int low = 0;
        int high = arr.length - 1;
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Original Matrix:");
        display(arr);
        System.out.println("\nRotated Matrix:");
        rotateArray(arr);
    }
}
