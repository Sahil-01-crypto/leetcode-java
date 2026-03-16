package leetcode;

import java.util.Stack;
class Pair{
    int data ;
    int index ;
    Pair( int data  , int index) {
        this.data = data;
        this.index = index;
    }
}
public class _stock_span {
    public  static  int calcStockSpan( int [] arr){
        Stack<Pair> st = new Stack<>();
        int ans = 1 ;
        for( int i = 0;i<arr.length ; i++){
            int count  ;
            int curr = arr[i];
            while( !st.isEmpty() && st.peek(). data <= curr ){
                st . pop();
            }
            if( st.isEmpty()){
                count = i+1 ;

            }
            else{
                count=  i - st.peek().index;
            }
            ans = Math . max(count , ans);
            st.push( new Pair(arr[i] , i));
        }
        return  ans ;

    }
    public static void main(String[] args) {
        int  stock[]={7,2,1,3,3,1,8};
        System.out.println(calcStockSpan(stock));
    }
}
