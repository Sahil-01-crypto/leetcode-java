package leetcode;

import java.util.Stack;

public class _stock_span {
    public  static  int calcStockSpan( int [] arr){
        int n = arr . length ;
        Stack<Integer> st = new Stack<>();
        int maxi =1 ;
        for( int i = 0;i<arr.length ; i++){
            int  count = 0;
            while(!st.isEmpty() && arr[st.peek()]<= arr[i]){
                st.pop();
            }
            if( st.isEmpty()){
                count+=i+1;
            }
            else{
                count += i-st.peek();
            }
            maxi = Math.max(maxi , count);
            st . push(i);
        }
        return  maxi ;
    }
    public static void main(String[] args) {
        int  stock[]={7,2,1,3,3,1,8};
        System.out.println(calcStockSpan(stock));
    }
}
