package leetcode;

import java.util.HashMap;

public class _1_two_sum {
    // B R U T E   F O R C E
    public static  int[] twoSumBrute (int[] nums, int target) {
        int ans [] = new int  [ 2 ];
        for(int i = 0 ; i <nums .length ; i++){
            for( int j =  i + 1 ; j <  nums .length ;  j++){
                if( nums [ i]+ nums [ j] == target ){
                    ans[0]=i ;
                    ans[1] = j ;
                    return ans ;
                }
            }
        }
        return new int []{-1 , -1 };
    }
    // O P T I M A L
    public static  int[] twoSum(int[] nums, int target) {
      HashMap<Integer , Integer> map = new HashMap<>();
      for( int i = 0;i< nums . length ; i++){
          if( map . containsKey(target-nums[i])){
              return new int [] {map .get(target - nums[i]) , i} ;
          }
          else{
              map . put ( nums[i], i );
          }
      }
      return new int [] {-1 ,-1 };

    }
    public static void main(String[] args) {
        int arr[]= {2,7,11,15};
        int target = 9;
        int ans[] = twoSum(arr, target);
        for( int i = 0 ; i<ans.length ; i++){
            System.out.print(ans[i]+" ");
        }

    }
}
