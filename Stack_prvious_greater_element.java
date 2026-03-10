package leetcode;

import java.util.Stack;

public class Stack_prvious_greater_element {
    public static  int [] pge( int arr[]){
        int   ans[]= new int[arr.length];
        Stack<Integer> st = new Stack<>();
        for( int i = 0 ;i<arr.length; i++){
            while( !st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }
            ans[i]=st.isEmpty()?-1 :st.peek();

            st.add(arr[i]);
        }
        return  ans ;
    }
    public static void main(String[] args) {
        int [] arr = {15, 10, 18, 12, 4, 6, 2, 8};
        int []  ans = pge(arr) ;
        for( int i = 0 ; i< ans.length ;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
