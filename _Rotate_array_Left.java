package leetcode;

public class _Rotate_array_Left {
    public  static   void rotateArray(int arr[] , int k ){
        int n = arr.length ;
        k = k% n ;
        reverse(arr , 0 , k-1);
        reverse(arr , k , n-1);
        reverse( arr , 0 , n-1);


    }
    public  static   void reverse( int arr[] , int i , int j ){
        while( i < j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]= temp ;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotateArray(arr , 2);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
