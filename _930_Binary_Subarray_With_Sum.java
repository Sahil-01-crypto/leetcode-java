package leetcode;

public class _930_Binary_Subarray_With_Sum {
//    O P T I M A L   A P P R O C H
    public  static int numSubarrayWithSumOptimal(int []nums ,int goal){
        return maxOnes( nums , goal)-maxOnes( nums, goal-1 );
    }
    public static  int maxOnes( int []nums , int goal ){
       int left = 0;
       int right = 0;
       int max = 0;
       int sum = 0;
       int count = 0;
       while( right < nums .length ){
           sum+= nums [ right];
           while( sum> goal){
               sum -= nums [ left];
               left ++ ;
           }
           count += right - left +1;
           right++ ;
       }
       return  count;
    }
//    B R U T E   F O R C E
    public  static int numSubarraysWithSum(int[] nums, int goal) {
       int count=0;

       for( int i = 0;i<nums.length;i++){
           int sum =0;
           for( int j = i ; j< nums .length ; j++){
                sum += nums [ j ];
               if( sum == goal ) count++ ;
               if( sum > goal ) break ;
           }
       }
       return  count;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,1,0,1};
        int goal =  2 ;
        System.out.println(numSubarraysWithSum(nums , goal ));
        System.out.println(numSubarrayWithSumOptimal(nums , goal ));
    }
}
