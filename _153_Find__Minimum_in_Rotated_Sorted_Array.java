package leetcode;

import java.io.FilterOutputStream;

public class _153_Find__Minimum_in_Rotated_Sorted_Array {
    public int findMin(int []arr  ){
        int low = 0 ;
        int high = arr.length-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = low +(high - low)/2;
            if(arr[low]<=arr[mid]){
                ans= Math.min(ans , arr[low ]);
                low = mid +1;
            }
            else{
                ans = Math.min(ans , arr[mid]);
                high = mid -1 ;
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr[]={3,4,5,2};
        _153_Find__Minimum_in_Rotated_Sorted_Array obj = new _153_Find__Minimum_in_Rotated_Sorted_Array();
        System.out.println("minimum element in the array is "+obj.findMin(arr));
    }
}
