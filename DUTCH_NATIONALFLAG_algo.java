package leetcode;

public class DUTCH_NATIONALFLAG_algo {
    static void swap(int []arr, int x , int y ){
        int temp = arr[x];
        arr[x]= arr[y];
        arr[y]= temp;
    }
    public  void display(int []arr ){
        for(int val :arr){
            System.out.print(val+" ");
        }
    }
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        while(mid <= high ){
            if(nums[mid]==0){
                swap(nums, low , mid);
                low ++;
                mid ++;
            }
            else if (nums[mid]==1) {
                mid ++;
            }
            else{
                swap(nums , mid , high );
                high --;
            }
        }
        display(nums);
    }

    public static void main(String[] args) {
        int num[]={2,0,2,1,1,0};
        DUTCH_NATIONALFLAG_algo obj = new DUTCH_NATIONALFLAG_algo();
        obj.sortColors(num);
    }
}
