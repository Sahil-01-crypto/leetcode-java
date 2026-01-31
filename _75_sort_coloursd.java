package leetcode;

public class _75_sort_coloursd {
    public void sortColors(int[] nums) {
        int a=0,b=0,c=0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]==0){
                a++;
            }
            else if(nums[i]==1){
                b++;
            }
            else{
                c++;
            }
        }
        // adding 0's at the front
        for(int st = 0;st<a;st++){
            nums[st]=0;
        }
        // adding 1's at the mid
        for(int st = a;st<a+b;st++){
            nums[st]=1;
        }
        // adding 2's at  the end
        for(int st = a+b;st<nums.length;st++){
            nums[st]=2;
        }
        for(int val:nums){
            System.out.print(val+" ");
        }

    }


    public static void main(String[] args) {
        int num[]={2,0,2,1,1,0};
        _75_sort_coloursd obj = new _75_sort_coloursd();
        obj.sortColors(num);

    }
}
