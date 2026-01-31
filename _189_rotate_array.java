package leetcode;

public class _189_rotate_array {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        k = k % length;
        reverse(nums ,0 , length-1);
        reverse(nums,0,k-1);
        reverse(nums,k , length-1);
    }
    public static  int [] reverse(int arr[],int low , int high ){
        int i = low;
        int j = high ;
        while( i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp ;
            i++;
            j--;

        }
        return arr;
    }
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,7};
        int k = 3 ;
        rotate(arr,k);
        for( int element : arr){
            System.out.print(element+" ");
        }
    }
}
