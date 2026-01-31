package leetcode;

import java.util.Arrays;

public class concecutive_ones {
    public  static  int consecutiveOnesBrute(int arr[]){
        Arrays.sort(arr);
        int maxCOnes= 1 ;
        int count = 1 ;
        for( int i = 1 ; i<arr.length; i++){
            if( arr[ i ] == arr[ i-1 ]){
                continue;
            }
            else if( arr[i]==arr[i-1]+1){
                count++;

            }
            else{
                maxCOnes = Math .max(maxCOnes, count);
                count = 1 ;
            }
        }
        maxCOnes = Math.max(maxCOnes , count);
         return  maxCOnes;
    }
    public static void main(String[] args) {
        int arr [] = {3,2,1,100,4,200,4,201 , 202 , 203 , 204 };
        System.out.println(consecutiveOnesBrute(arr));
    }
}
