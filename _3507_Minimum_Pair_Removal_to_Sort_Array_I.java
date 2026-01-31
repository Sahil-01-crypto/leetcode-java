
package leetcode;
import java.util.*;
public class _3507_Minimum_Pair_Removal_to_Sort_Array_I {
    public static int minimumPairRemoval(int []nums){
        List <Integer>   l1 =new ArrayList<>();
        for( int x:nums){
            l1 . add(x) ;
        }
        int counter = 0 ;
        while( !sorted(l1)){
            int minSum = Integer.MIN_VALUE;
            int sum = 0 ;
            int index = 0;
            for( int i = 0 ; i< l1.size()-1 ; i++){
                sum = l1.get( i)+ l1 . get(i+1);
                if( sum<minSum){
                    minSum  = sum ;
                    index = i ;
                }
            }
            l1 . set( index , minSum);
            l1 . remove(index+1);
            counter++;

        }
        return counter ;
    }
    public static boolean sorted( List<Integer> l1){
        for(int i = 0;i < l1.size()-1 ; i++){
            if( l1.get( i)> l1 . get( i+1)){
                return false ;
            }
        }
        return  true ;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,2 };
        System.out.println(minimumPairRemoval(nums));
    }
}
