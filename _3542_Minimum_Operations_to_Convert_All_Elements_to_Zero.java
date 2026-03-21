package leetcode;

import java.util.HashSet;

public class _3542_Minimum_Operations_to_Convert_All_Elements_to_Zero {
    public  static  int minOperation( int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for( int x: arr) {
            set.add(x);
        }
        int count = 0;
        for( int x: set){
            boolean  cut = false ;
            for( int i = 0;i< arr.length ; i++){
                if( arr[i]== x){
                    if( !cut){
                        count++;
                        cut = true;
                    }
                }
                else if( arr[i]<x){
                    cut = false ;
                }
            }
        }
        return  count ;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,2};
        System.out.println(minOperation(arr));
    }
}
