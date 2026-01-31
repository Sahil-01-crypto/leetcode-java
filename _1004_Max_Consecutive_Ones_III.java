package leetcode;

public class _1004_Max_Consecutive_Ones_III {
//    O P T I MA L    S O L U T I O N
    public  static int longestOnesOptimal(  int nums [] , int k ){
        int max =0;
        int right =0, left =0, zeros=0;
        while( right<nums.length){
            if( nums[right]==0) zeros++;
            while( zeros>k){
                if( nums [left]==0)zeros--;
                left++;
            }
            if( zeros<= k){
                max= Math . max(max,right -left +1);

            }
            right++;
        }


        return max;
    }
//    B R U T E    F O R C E
    public  static int longestOnes(int[] nums, int k) {
    int max=0;

    for( int i =0;i< nums .length;i++){
        int zeros = 0;
        for( int j =i;j<nums.length ; j++){
            if(nums[j]== 0) zeros ++;
            if( zeros<= k){
                max=Math.max(max,j-i+1);
            }
            else{
                break ;
            }
        }
    }
    return max;
    }
    public static void main(String[] args) {
        int arr [ ] ={ 1,1,1,0,0,0,1,1,1,1,0};
        int k = 2 ;
        System.out.println(longestOnes(arr , k ));
        System.out.println(longestOnesOptimal(arr , k ));


    }
}
