package leetcode;

import java.util.*;

public class _992_Subarrays_with_K_Different_Integers {
    public static int subarraysWithKDistinctOptimal (int[] nums, int k) {
        return findSubArray(nums , k)- findSubArray(nums , k-1);
    }
    public static  int findSubArray(int nums [], int k ){
        int right = 0 ;
        int left = 0;
        Map<Integer , Integer >  map = new HashMap<>();
        int count = 0 ;
        while( right< nums .length) {
            int curr = nums[right];
            if (map.containsKey(curr)) map.put(curr, map.get(curr) + 1);
            else map.put(curr, 1);

            while(map . size()> k ){
                 int leftcurr = nums [ left];
                 map . put( leftcurr , map . get(leftcurr)-1 );
                 if( map . get( leftcurr)==0) map .remove(leftcurr);
                 left++ ;
            }

            
            count+= right - left + 1;
            right++;
        }
        return  count ;
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer , Integer> map = new HashMap<>();
        int count = 0;
       for( int i = 0 ;i < nums .length ; i++){
           map . clear();
           for( int j = i ; j< nums .length ; j++){
               if( map . containsKey(nums[j] )) map . put( nums[ j ] , map . get(nums[j])+1);
               else  map . put( nums[j], 1 );

               if( map . size()==k){
                   count ++ ;
               }
               if( map . size()> k ) break ;
               }
           }
        return  count;
       }


    public static void main(String[] args) {
        int arr []={1,2,1,2,3};
        int k = 2 ;
        System.out.println(subarraysWithKDistinct(arr , k ));
        System.out.println(subarraysWithKDistinctOptimal(arr, k ));
    }
}
