package leetcode;

import java.util.Arrays;

public class _3634_Minimum_Removals_to_Balance_Array {
    public  static  int balanceAray( int []arr , int k){
        int n = arr . length ;
        Arrays.sort(arr);
        int left  = 0 ;
        int right = 0;
        int max = 0 ;
        while(right<n){
            if((long)arr[right]<= (long)arr[left]*k){
                max = Math . max( max  , right - left+1);
                right++ ;

            }
            else{
                left++;
            }
        }
        return  n- max;
    }
    public static void main(String[] args) {
        int arr []={1 , 6 , 2 , 9};
        int k = 3;
        System.out.println(balanceAray(arr , k ));
    }
}
