package leetcode;

import java.util.Stack;

public class _907_Sum_of_Subarray_Minimums {
    public static  int  sumSubarrayMinsOPTIMAL(int[] arr) {
        int n = arr.length ;
        int pse[]= findPse(arr);
        int nse[] = findNse(arr);
        int sum = 0;
        for( int i = 0;i<n; i++){
            int left = i- pse[i];
            int right= nse[i] - i ;
            int current = arr[i]*(left * right );
            sum+=current ;
        }
        return  sum;
        }
     public  static  int [ ] findNse(  int arr [ ]){
        int n = arr.length;
        int[] nse = new int[n];
        Stack<Integer> st = new Stack<>();
        for( int i =n-1 ; i>=0 ;i--){
            while( ! st .isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            nse[i]= st.isEmpty()?n : st.peek();
            st . push(i);
        }
        return  nse ;
     }
     public  static  int [] findPse( int arr [ ]){
        int n = arr.length;
        int pse [] = new int[n];
        Stack<Integer> st = new Stack<>();
        for( int i = 0 ; i<n; i++){
            while( !st.isEmpty() && arr[st.peek()]>= arr[i]){
                st.pop();
            }
            pse[i]= st.isEmpty()?-1 :st.peek();
            st.push(i);
        }
        return  pse ;
     }
//     B R U T E    F O R C E
    public static  int  sumSubarrayMins(int[] arr) {
     int sum = 0;
     int min= Integer.MAX_VALUE;
     for( int i = 0;i<arr.length ; i++){
         min = arr[i];
         for(int j = i ; j<arr.length ; j++){
             min = Math.min(min , arr[ j ]);
             sum+= min ;
         }
     }
     return sum ;
    }
    public static void main(String[] args) {
        int arr [ ] ={3,1,2,4};
        System.out.println(sumSubarrayMins(arr ));
        System.out.println(sumSubarrayMinsOPTIMAL(arr));
    }

}
