package leetcode;

public class _162_Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int n = nums . length;
        if(n==1){
            return nums[0];
        }
        if(nums[0]>nums [ 1 ]) return nums [ 0];
        if(nums [ n-1 ]>nums [ n-2]) return nums [ n-1 ];

        int low = 1 ;
        int high = n-2 ;
        while(low<= high ){
    int mid = low +( high - low )/2 ;
    if(nums [ mid]>nums [ mid -1 ] && nums [ mid ]>nums [ mid +1 ]){
        return  mid ;
    }
    else if(nums [ mid ]>nums [ mid -1 ]){
        low = mid +1 ;
    }
     else if(nums [ mid ]>nums [ mid +1 ]){
         high = mid -1 ;
    }
     else {
         high = mid -1 ;
    }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int arr [ ]= {1,2,1,3,5,6,4};
        _162_Find_Peak_Element obj = new _162_Find_Peak_Element();
        System.out.println("the peak element is at index "+  obj .findPeakElement(arr ));
    }
}
