package leetcode;

import java.util.Arrays;

public class _1877_Minimize_Maximum_Pair_Sum_in_Array {
    public  static  int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int miniMaxPair = Integer.MIN_VALUE;
        int i = 0;
        int j = nums.length-1 ;
        while( i< j){
            int sum = nums[i]+ nums[j];
            miniMaxPair = Math . max(miniMaxPair , sum);
            i++;
            j--;
        }
        return  miniMaxPair;
    }
    public static void main(String[] args) {
        int [] nums = {3,5,2,3};
        System.out.println(minPairSum(nums));
    }
}
