package leetcode;

import java.util.ArrayList;
import java.util.List;
public class _229_Majority_Element_II {
    public List<Integer> majorityElement(int[] nums) {
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        int count_1=0;
        int count_2=0;
        for(int i = 0;i<nums . length; i++){
            if(count_1==0 && e2!=nums[i]) {
                count_1 = 1;
                e1 = nums[i];
            }
            else if(count_2==0&& e1!=nums[i]){
                count_2=1;
                e2=nums[i];
            }
            else if(nums[i]==e1){
                count_1++;
            }

            else  if(nums[i]==e2){
                count_2++;
            }
            else{
                count_1--;
                count_2--;
            }
        }
        List <Integer>l1= new ArrayList<>();
        // checking if the decided element is  reater than n/3 or not
        int c1=0;
        int c2=0;
        for(int i = 0 ; i<nums.length; i++){
            if(e1==nums[i]){
               c1++;
            }
            else if(e2==nums[i]){
                c2++;
            }
        }
        int max = (nums.length)/3+1;
        if(max<=c1){
            l1.add(e1);
        }
        if(max<=c2){
            l1.add(e2);
        }

        return l1 ;


    }
    public static void main(String[] args) {
        int nums []={11,13,13,11,13,11};
        _229_Majority_Element_II obj = new _229_Majority_Element_II();
        List<Integer >l1 =obj.majorityElement(nums );
        System.out.println(l1);
    }
}
