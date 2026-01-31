package leetcode;

public class _53_Maximum_Subarray {
//    B R U T E     F O R C E
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        for( int i = 0;i< nums . length; i++){
            int sum = 0;

            for( int j =i+1 ; j< nums.length ;j++){
                sum+= nums[j];
                max= Math.max(max , sum );
            }
        }
        return max ;

    }
    public int maxSubArrayOptimal(int[] nums) {
        int maxi=Integer.MIN_VALUE;
        int sum = 0;
        for( int i = 0 ;i< nums.length;i++){
            sum+= nums[i];

            maxi = Math.max(maxi , sum);
            if( sum <0) sum = 0;
        }
        return  maxi;
    }

    public static void main(String[] args) {
        int nums []={-2,-3,4,-1,-2,1,5,-3};
        _53_Maximum_Subarray obj = new _53_Maximum_Subarray();
        System.out.println(obj .maxSubArray(nums ));

    }
}
