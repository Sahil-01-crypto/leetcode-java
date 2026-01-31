package leetcode;

import java.util.Stack;

public class next_greater_element {
    //O P I M A L  F O R C E
    public static  int [] nextGreaterOptimal(int arr[]){
       Stack<Integer> st = new Stack<>();
       int ans [] = new int[arr.length];
       for( int i = arr.length-1 ; i>=0 ; i--){
           while( !st . isEmpty() && st . peek()<arr[i]){
               st . pop();
           }
           ans[i]=st.isEmpty()?-1:st.peek();
           st.push(arr[i]);
       }
       return ans ;
    }

    //B R U T E   F O R C E
    public static  int [] nextGreater(int arr[]){
        int ans [] = new int[arr.length];
        for( int i = 0 ;i<arr.length ; i++){
            ans[i]=-1;
            for( int j = i+1 ; j< arr.length;j++){
                if( arr[j]>arr[i]) {
                    ans[i] = arr[j];
                    break ;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        int ans[]= nextGreater(arr);
        int ans2[] = nextGreaterOptimal(arr);
        for( int val:ans2) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
