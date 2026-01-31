package leetcode;

public class _1752_Check_if_Array_Is_Sorted_and_Rotated {
    public boolean check(int[] nums) {
        int n = nums.length;
        int pair = 0;
        for(int i = 1;i<n; i++){
            if(nums [i-1]>nums[i] ){
                pair ++;
            }
        }
        if(nums[n-1]>nums[0]){
            pair ++;
        }
        return pair<=1;
    }
    public static void main(String[] args) {

        int arr []={1,2,3,4,5};
        _1752_Check_if_Array_Is_Sorted_and_Rotated obj = new _1752_Check_if_Array_Is_Sorted_and_Rotated();
        System.out.println(obj.check(arr));
    }
}
