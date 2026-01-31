package leetcode;

import java.util.*;

public class _448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> l1  = new ArrayList<>();
        for(int  val :nums ){
            l1.add(val);
        }

        List<Integer> ans= new ArrayList<>();
        int max = Integer . MIN_VALUE;
        for(int i =0 ; i<nums.length; i ++){
            max= Math.max(max,nums[i]);
        }
        for(int i = 1 ; i <max ; i ++){
            if(!l1.contains(i)){
                ans .add(i);
            }

        }
        if(ans .isEmpty()){
            ans . add(max+1);
        }
        return ans ;
    }
    public static void main(String[] args) {
        int arr []={1,1};
        _448_Find_All_Numbers_Disappeared_in_an_Array ob = new _448_Find_All_Numbers_Disappeared_in_an_Array();
        List<Integer> l1 =ob.findDisappearedNumbers(arr);
        System.out.println("missing numbers are "+ l1);

    }
}
