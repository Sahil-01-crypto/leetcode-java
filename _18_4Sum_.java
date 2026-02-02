package leetcode;
import java . util . *;
public class _18_4Sum_ {
    public  static  List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays . sort(nums);
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        for( int i = 0;i<n-3; i++){
            if(i!=0 && nums [i]==nums[i-1]){
                continue;
            }
            for( int j = i+1 ; j<n-2 ; j++){
                if( j>i+1 && nums[j]== nums[j-1]){
                    continue ;
                }

                int k = j+1;
                int l = n-1 ;
                while(k<l){
                    long sum = (long)nums[i]+nums[j]+nums[k]+nums[l];
                    if( sum == target){
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        temp.add(nums[l]);

                       ans . add( temp);
                       k++;
                       l--;
                       while(k<l && nums[k]==nums[k-1]){
                           k++;
                       }
                       while(k<l && nums[l]==nums[l+1]){
                           l--;
                       }

                    }
                    else if(sum<target){
                        k++;
                    }
                    else{
                        l--;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nums = {1,0,-1,0,-2,2};
        int target =0;
        List<List<Integer>> result =  fourSum(nums , target);
        System.out.println(result);
    }
}
