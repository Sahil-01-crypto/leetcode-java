package leetcode;

public class _2439_Minimize_Maximum_of_Array {
    public  static  int minimizeArrayValues( int arr[]){
        int low =  0 ;
        int high = calc(arr);
        int ans = -1 ;
        while( low<= high) {
            int mid = low+( high - low)/2 ;
            if( checkmid(arr , mid)){
                ans = mid ;
                high = mid -1 ;
            }
            else{
                low = mid+1 ;
            }
        }
        return ans ;
    }
    public  static   boolean checkmid( int arr[] , int mid){
      int extra  = 0 ;
      for( int i = arr . length -1 ; i >= 0 ; i--){
          int val = arr [ i]+ extra ;
          if( val> mid){
              extra = val - mid ;
          }
          else {
              extra = 0;
          }
      }
      return extra== 0 ;


    }
    public static  int calc( int arr[]){
        int max = Integer.MIN_VALUE;
        for( int x: arr){
            max = Math . max(max ,x);
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={3,7,1,6};
        System.out.println(minimizeArrayValues(arr));
    }
}
