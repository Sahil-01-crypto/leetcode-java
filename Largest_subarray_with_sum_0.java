package leetcode;

import javax.swing.plaf.IconUIResource;
import java.util.HashMap;

public class Largest_subarray_with_sum_0 {
    public static  int lSubarrayOPt(int arr []){
        HashMap<Integer , Integer > map = new HashMap<>();

        int max_subarry = 0 ,  prefixsum= 0 ;
        for( int i = 0; i<arr.length ;  i ++){
            prefixsum += arr[ i ];
            if( map . containsKey(prefixsum)){
                max_subarry = Math.max(max_subarry , i - map.get(prefixsum));
            }
             else{
                  map .put(arr[ i ] , i );
            }
        }
         return  max_subarry ;
    }
//     B R U T E    F O R C E
    public static  int lSubarray(int arr [ ]){
        int max_subaray = 0 ;
        for( int i = 0; i <arr.length ; i++){
            int sum = 0 ;
            int counter = 0;
            for( int j = i ; j< arr.length; j++) {
                sum = sum + arr[j];
                counter++;
                if (sum == 0) {
                    if (counter > max_subaray) {
                        max_subaray = counter;
                    }
                }
            }
        }
        return max_subaray ;
    }
    public static void main(String[] args) {
        int arr [ ] ={1,2,3 };
        System.out.println(lSubarrayOPt(arr ));
    }
}
