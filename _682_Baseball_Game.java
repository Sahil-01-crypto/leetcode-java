package leetcode;
import  java . util.*;
public class _682_Baseball_Game {
    public  static  int calPoints( String [] arr){
        Stack<Integer> st = new Stack<>();
        for( String   op : arr){
            if(op.equals("+")){
                int top = st.pop();
                int topper = st.peek();
                int sum = top+ topper;
                st.push(top);
                st.push(sum);

            }
            else if( op.equals("D")){
                int ele = st.peek();
                int newer = ele*2;
                st.push(newer);
            }
            else if( op . equals("C")){
                st.pop();
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0 ;
        while( !st.isEmpty()){
            sum+=st.pop();
        }
        return  sum;
    }
    public static void main(String[] args) {
        String[] arr={"5","2","C","D","+"};
        System.out.println(calPoints(arr));
    }
}
