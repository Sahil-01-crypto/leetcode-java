package leetcode;

public class _1248_Count_Number_of_Nice_Subarrays {
    // O P T I M A L   A P P R O C H
    public static  int numberOfSubarraysOptimal(int[] nums, int k) {
        return maxOnes ( nums , k )- maxOnes( nums , k-1 );

    }
    public  static  int maxOnes(int [ ] nums , int k ){
        int right =0, left =0,total=0, sum =0;
        while( right < nums .length){
            sum+= nums[right]%2;

            while( sum> k){
                sum-=nums [ left]%2 ;
                left ++ ;
            }
            total+= (right - left +1 );
            right ++;
        }
        return  total ;
    }

        //  B R U T E   F O R C E
    public static  int numberOfSubarrays(int[] nums, int k) {
       int total=0;
       for( int i =0;i < nums.length;i++){
           int sum =0;
           for( int j=i;j< nums.length; j++){
               if( nums[i]% 2==1){
                   sum+= nums[i];
               }
               if( sum==k){
                   total++;
               }
               if( sum>k) break ;
           }
       }
       return total;
    }
    public static void main(String[] args) {
        int nums [] ={1,1,2,1,1};
        int k = 3  ;
        System.out.println(numberOfSubarrays(nums , k ));
        System.out.println(numberOfSubarraysOptimal(nums , k ));
    }
}
