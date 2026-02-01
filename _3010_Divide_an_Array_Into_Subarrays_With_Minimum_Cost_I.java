package leetcode;
import  java . util . *;
public class _3010_Divide_an_Array_Into_Subarrays_With_Minimum_Cost_I {
    public  static  int   minimumCost(int[] nums) {
        if(nums.length<3){
            return -1 ;
        }
        int mostSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for( int i = 1 ;i< nums . length ; i++){
            if(nums[i]<mostSmallest){
                secondSmallest = mostSmallest;
                mostSmallest= nums[i];
            }
            else if( nums [i]<secondSmallest){
                secondSmallest = nums[i];
            }
        }
        return nums[0]+mostSmallest + secondSmallest;
    }
    public static void main(String[] args) {
        int arr[] ={10 , 3 , 1 , 1};
//minimumCost(arr);
        System.out.println(minimumCost(arr));
    }
}
