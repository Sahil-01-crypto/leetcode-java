package leetcode;

public class Tapping_rain_water {
//     optimal approch
    public static int trapOptimal( int [] arr){
        int left = 0 ;
        int right = arr.length -1 ;
        int leftMax= 0 ;
        int rightMax = 0 ;
        int trapWater = 0 ;
        while( left < right ){
            if( arr[ left ]<= arr[ right ]){
                if( leftMax > arr[ left ]){
                    trapWater+= leftMax - arr[ left ];
                }
                else{
                    leftMax = arr [left];
                }
                left++;
            }
            else{
                if( rightMax> arr [ right]){
                    trapWater+= rightMax - arr[ right];
                }
                else{
                    rightMax = arr [ right ];
                }
                right -- ;
            }
        }
        return  trapWater ;

    }
//     brute force  method
    public  static  int trap( int []arr){
        int [] prefix = findPrefixMax ( arr );
        int [] suffix = findSuffixMax ( arr );
        int watertrap = 0 ;
        for( int i = 0 ; i<arr.length ; i++){

                watertrap += Math.min(prefix[i], suffix[i]) - arr[i];

        }
        return  watertrap ;

    }
     public  static  int [ ] findPrefixMax( int [] arr ){
        int prefix[] = new int [ arr.length ];
        prefix [ 0 ] = arr [ 0];

        for( int i = 1 ; i<arr.length ; i++){
            prefix[i]= Math.max(prefix[ i-1 ]  ,  arr[i]);
        }
         return  prefix;
     }
      public static  int [] findSuffixMax( int arr[]){
        int n =  arr . length ;
        int suffix  [ ] = new int[n] ;
        suffix[ n-1 ] = arr[  n-1 ];
        for( int i = n-2 ; i>=0 ; i--){
            suffix[i]= Math .max(suffix[i+1],arr[ i ]);
        }
        return  suffix ;
      }

    public static void main(String[] args) {
        int arr []= {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trapOptimal(arr));
    }
}
