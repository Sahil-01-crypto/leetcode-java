package leetcode;

public class _31_Next_Permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        // finading the breakpoint ;   2,_1_,5,4,3,0,0}
        int index = -1;
        for(int i= n-2;i>=0;i--){
            if(nums[i]<nums [ i+1]){
                index = i ;
                break ;
            }
        }
        if(index==-1){
            reverse(nums ,0 , n-1);
            return  ;
        }
        // checking which element is greater than the index element from back
        // if that number is found than swap
        for(int i = n-1;i>index;i--){
            if(nums [ i]>nums [ index]){
                swap(nums , index , i );
                break ;
            }
        }
        reverse(nums , index+1, n-1);



        }
        public  void reverse(int [ ] arr, int x , int y ){
        while(x<y){
            int temp = arr[x];
            arr[x]= arr[y];
            arr[y]= temp ;
            x++;
            y--;
        }
        }
        public    void swap(int [ ] arr , int  i , int j){
        int temp = arr[i ];
        arr[ i ]= arr[j];
        arr[j]= temp;

    }

    public static void main(String[] args) {
        int arr []= {1,3,2};
        _31_Next_Permutation obj = new _31_Next_Permutation();
        obj.nextPermutation(arr);
        for(int val :arr){
            System.out.print(val+" ");
        }


    }
}
