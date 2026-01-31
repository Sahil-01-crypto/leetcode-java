package leetcode;

public class _1283_Find_the_Smallest_Divisor_Given_a_Threshold {
    public static  int smallestDivisor(int[] nums , int threshold ){

        int max = Integer. MIN_VALUE;
        int ans = -1 ;
        for(int  val : nums) {

            max = Math.max(max, val);
        }
         int low = 1  ;
        int  high = max ;
        while(low <= high ){
            int mid =  low +(high - low )/2 ;
            int  smalldiv = calcSmall(nums , mid );
            if(smalldiv<= threshold){
                ans = mid ;
                high = mid -1 ;
            }
            else{
                low = mid +1 ;
            }

        }
        return ans;
    }
     public static  int calcSmall(int [] arr , int currentSmallest   ){
        int total = 0 ;
        for(int i = 0 ; i <arr.length; i ++){
            total+= (int)Math.ceil((double)(arr[i])/(currentSmallest));
        }
        return  total;
     }

    public static void main(String[] args) {
        int arr []={44,22,33,11,1};
        int threshold =  5   ;
        System.out.println(smallestDivisor(arr, threshold));
    }
}
