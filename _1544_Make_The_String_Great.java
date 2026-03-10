package leetcode;

import java.util.Stack;

public class _1544_Make_The_String_Great {
    public static  String makeGreat(  String str){
        Stack<Character> st  = new Stack<>();
        for ( int i = 0 ;i< str . length() ; i++){
            char ch =  str . charAt(i);
            while ( ! st. isEmpty() && Math . abs( st .peek()-ch)==32){
                st .pop();
            }
            st . push(ch);
        }
        StringBuilder sb = new StringBuilder();
      while (!st.isEmpty()){
          sb.append(st.pop());
      }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str  = "leEeetcode";
        System.out.println(makeGreat( str ));
    }
}
