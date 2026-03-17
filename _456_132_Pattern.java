package leetcode;

import java.util.Stack;

public class _456_132_Pattern {
    public  static  boolean check( int arr[]){
        int n = arr.length ;
        int num2 = Integer . MIN_VALUE ;
        Stack<Integer> st = new Stack<>();
        for( int i = n-1; i>=0 ; i--){
            if( arr[i]<num2){
                return true;
            }
            while (!st.isEmpty()&& st.peek()<arr[i]){
                num2 = st.pop();
            }
            st.push(arr[i]);
        }
        return false ;
    }
    public static void main(String[] args) {
         int arr[] = {3,1,4,2} ;
        System.out.println(check( arr));
    }
}
