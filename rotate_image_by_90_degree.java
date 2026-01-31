package leetcode;

//import java.awt.desktop.PreferencesEvent;

public class rotate_image_by_90_degree {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }

        }
        for (int i = 0; i < matrix.length; i++) {
            int st = 0;
            int en = matrix.length - 1;
            while (st < en) {
                int temp = matrix[i][st];
                matrix[i][st] = matrix[i][en];
                matrix[i][en] = temp;
                st++;
                en--;
            }
        }
        display(matrix);
    }
    public   void display(int [][]arr){
        for(int i = 0;i< arr.length; i++){
            for(int j = 0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

        public static void main(String[] args) {
        int [ ][ ]arr= {{1,2,3},{4,5,6},{7,8,9}};
        rotate_image_by_90_degree obj = new rotate_image_by_90_degree();
        obj.rotate(arr);

    }
}
