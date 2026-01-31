package leetcode;

public class _560_subarray_sum_equal_to_k {


    public int subarraySum(int[] nums, int k) {
       int count = 0 ;
       for( int i = 0 ; i< nums . length ; i++){
           int sum = 0;
           for( int j = i ; j<nums.length ;j++){
               sum+= nums[j];
               if(sum==k)  count++;
           }
       }
       return count ;
    }
    public static void main(String[] args) {
        int arr[]={3,2,1};
        int k  = 3;
        _560_subarray_sum_equal_to_k obj  = new _560_subarray_sum_equal_to_k();
        System.out.println(obj.subarraySum(arr, k ));
    }
}
