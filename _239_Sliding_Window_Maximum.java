package leetcode;

import java.util.List;

public class _239_Sliding_Window_Maximum {
    public  static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums .length;

        int ans[]= new int [n-k +1 ];
        for( int i= 0 ;i<= n- k ; i++){
            int   max = nums[i];
            for( int j = i ; j<=i+k-1; j++){
                max = Math . max(max ,  nums [ j ]);

            }
            ans [ i ]= max ;
        }
        return ans ;
    }
    public static void main(String[] args) {
        int nums [ ]= {1,3,-1,-3,5,3,6,7};
        int k =3 ;
        int ans []= maxSlidingWindow(nums , k );
        for( int  element : ans ){
            System.out.print(element +" ");
        }
    }
}
