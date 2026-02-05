package leetcode;
public class _3151_Special_Array_I_ {
    public  static  boolean isSpecial( int arr[]){
     int n = arr.length;
     for( int i = 0 ;i< arr.length-1 ; i++){
         if((arr[i]%2) == (arr[i+1]%2)){
             return false;
         }
     }

     return true ;
    }
    public static void main(String[] args) {
        int nums []={2,2,4};
        System.out.println(isSpecial(nums));
    }
}
