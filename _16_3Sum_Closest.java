package leetcode;

import java.lang.reflect.Array;
import java . util.*;
public class _16_3Sum_Closest {
    public  static  int threeSumClosest(int [] nums , int target  ){
        int n = nums.length;
        int closest = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0;i<n-1 ; i++){
            int  j= i+1;
            int k = n-1 ;
            while(j<k){
                int sum = nums [ i]+ nums[j]+ nums[k];
                if( Math.abs(target - sum)<Math.abs(target-closest)){
                    closest= sum;
                }
                if(sum<target){
                    j++;
                }
                else if (sum>target){
                    k--;
                }
            }
        }
        return closest;

    }
    public static void main(String[] args) {
        int[]nums={-1,2,1,-4};
        int target = 1;
        System.out.println(threeSumClosest(nums , target));


    }
}
