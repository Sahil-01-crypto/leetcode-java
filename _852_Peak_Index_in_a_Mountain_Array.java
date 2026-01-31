package leetcode;

public class _852_Peak_Index_in_a_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        int n  = arr.length;
        int low = 1 ;
        int high = n-2 ;
        while(low<= high ){
            int mid = low +(high - low )/2 ;

            if(arr[ mid ]>arr[mid -1 ] && arr[ mid ]>arr[ mid+1 ]){
                return mid ;
            }
            else if(arr[ mid ]<arr[mid+1 ]){
                low = mid +1 ;
            }
            else if(arr[mid ]<arr[mid-1]){
                high = mid-1 ;
            }
        }
        return -1  ;
    }
    public static void main(String[] args) {
        int arr [ ]= {1, 2, 3, 4, 3, 2, 1};
        _852_Peak_Index_in_a_Mountain_Array obj = new _852_Peak_Index_in_a_Mountain_Array();
        System.out.println("index of peak element is "+ obj . peakIndexInMountainArray(arr));
    }
}
