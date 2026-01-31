package leetcode;

import java.util.Arrays;
import java.util.HashSet;

public class _longest_conscutive_sequence {
    public int Consecutive_seq(int  []nums) {

//        BETTER   FORCE  METHOD


//        Arrays.sort(nums );
//        int max_count =Integer.MIN_VALUE;
//        int count = 1;
//        for(int i = 1;i<nums.length;i++){
//            if(nums[i]==nums[i-1]){
//                continue;
//            }
//            if(nums[i]==nums[i-1]+1){
//                count  ++;
//            }
//            else{
//                max_count = Math.max(count,max_count);
//                count  = 1;
//            }
//        }
//        return Math.max(count,max_count);


        // OPTIMAL APPROCH

        if(nums.length==0){
            return 0 ;
        }
        HashSet<Integer>hs  = new HashSet<>();
        for(int num :nums ){
            hs.add(num);
        }
        int max_count  = 0;
        for(int num:nums){
            if(!hs.contains(num-1)){
                int current_element = num;
                int count  = 1;

                while(hs.contains(current_element+1)){
                    count++;
                    current_element++;
                }

                max_count= Math.max(max_count, count);
            }
        }
        return max_count;
    }
    public static void main(String[] args) {
        int nums []={3, 8, 5, 7, 6};
        _longest_conscutive_sequence obj = new _longest_conscutive_sequence();
        System.out.println(obj .Consecutive_seq(nums));
    }
}
