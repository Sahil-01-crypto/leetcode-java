package leetcode;

import java.util.Stack;

public class _2390_Removing_Stars_From_a_String {
    public static  String removeStar(String s){
        Stack<Character> st = new Stack<>() ;
        for( int i = 0; i<s . length() ; i++){
            char ch = s.charAt( i);
            if( ch =='*'){
                if( !st.isEmpty()){
                    st.pop();
                }

            }
            else{
                st.push(ch);
            }
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append( st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "leet**cod*e";
        System.out.println(removeStar(str));
    }
}
