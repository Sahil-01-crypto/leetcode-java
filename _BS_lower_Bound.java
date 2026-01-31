package leetcode;

public class _BS_lower_Bound {
    public static  int lower_bound(int []nums , int target ){
        int low = 0;
        int high = nums.length-1;
        int ans = nums.length;
        while(low<= high ){
            int mid = low +(high - low )/2;
            if(nums [ mid ]>=target){
                ans  = mid ;
                high= mid-1 ;
            }
            else if(nums [mid ]<target){
                low = mid +1 ;
            }
        }
        return  ans;


    }
    public static void main(String[] args) {
        int arrr[]= {3, 5, 8, 15, 19};
        int target = 9 ;
        int ind = lower_bound(arrr, target);
        System.out.println("the lower bound is the index "+ind);

    }
}
