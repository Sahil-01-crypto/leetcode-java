package leetcode;

public class _3637_Trionic_Array_I_ {
    public  static   boolean isTrionic(int [] nums){
        int n = nums . length ;
        int i = 0;
        while( i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        if( i == 0 || i == n-1){
            return false;
        }
        while(i+1<n && nums[i]>nums[i+1]){
            i++;
        }
        if(i==n-1){
            return false ;
        }
        while( i+1<n && nums[i]<nums[i+1]){
            i++;
        }
        return i == n-1 ;
    }
    public static void main(String[] args) {
        int nums [] = {1,3,5,4,2,6};
        System.out.println(isTrionic(nums));
    }
}
