package leetcode;

import com.sun.source.tree.BreakTree;

public class _34_Find_First_and_Last_Position_0f_Element_in_Sorted_Array {

    public int[] searchRange(int[] arr, int target) {
        int left = position(arr, target, true);
        int right = position(arr, target, false);
        return new int[]{left, right};
    }

    public static int position(int[] nums, int target, boolean find) {
        int low = 0;
        int high = nums.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                index = mid;
                if (find) {
                    high = mid - 1;
                }
                else{
                    low= mid +1;
                }
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9};
        int target = 5;
        _34_Find_First_and_Last_Position_0f_Element_in_Sorted_Array obj = new _34_Find_First_and_Last_Position_0f_Element_in_Sorted_Array();
        int[] new_arr = obj.searchRange(arr, target);
        for (int element : new_arr) {
            System.out.print(element + " ");

        }
    }
}
