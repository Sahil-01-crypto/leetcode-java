package leetcode;

public class _33_Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int low = 0 ;
        int  high = nums . length-1 ;

        while(low<= high){
            int mid = low +(high - low )/2 ;
            if(nums [ mid]== target )
                return mid ;

            if(nums[low]<= nums [ mid ]){
                if(nums[low]<=target && target<=nums[mid]){
                     high = mid -1 ;
                }
                else{
                    low = mid +1;
                }
            }
            else{
                if(nums [mid ]<=target && target <= nums[high ] ){
                    low = mid+1;
                }
                else{
                    high = mid -1 ;
                }
            }

        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr[]={7,8,9,1,2,3,4,5,6};
        int target = 2;
        _33_Search_in_Rotated_Sorted_Array obj = new _33_Search_in_Rotated_Sorted_Array();
        System.out.println(obj . search(arr, target));
    }
}
