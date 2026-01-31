package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _54_spiral_matrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> hs = new ArrayList<>();
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0, right = m - 1, bottom = n - 1, left = 0;
        // printing top
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                hs.add(matrix[top][i]);
            }            top++;
            for (int i = top; i <= bottom; i++) {
                hs.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    hs.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right)
                for (int i = bottom; i >= top; i--) {
                    hs.add(matrix[i][left]);
                }
            left++;
        }

        return hs;
}



    public static void main(String[] args) {
        int  arr [][]= {{1,2,3},{4,5,6},{7,8,9}};
        _54_spiral_matrix obj = new _54_spiral_matrix();
        System.out.println(obj.spiralOrder(arr));
    }
}
