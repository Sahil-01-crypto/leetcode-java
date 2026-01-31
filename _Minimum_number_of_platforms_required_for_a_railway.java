package leetcode;

public class _Minimum_number_of_platforms_required_for_a_railway {
    public static  int minPlatform(int[]arr , int []dep ){
        int arrivalPointer=0 , departurePointer = 0, count = 0, maxCount = 0;
        while(arrivalPointer<arr.length && departurePointer<dep.length){
            if(arr [ arrivalPointer]<dep[departurePointer]){
                count ++ ;
                arrivalPointer++ ;
            }
            else if (arr[arrivalPointer]> dep[departurePointer]){
                count -- ;
                departurePointer++ ;
            }
            maxCount= Math .  max(maxCount , count );
        }
        return  maxCount ;
    }
    public static void main(String[] args) {
        int[]arr = {1020, 1200};
        int []dep = {1050, 1230 };
        System.out.println(minPlatform(arr , dep ));
    }
}
