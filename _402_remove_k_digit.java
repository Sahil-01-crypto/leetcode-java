package leetcode;

import java.util.Stack;

public class _402_remove_k_digit {
    public  static  String removekDigit(String str , int k ){
        int n = str.length() ;
        Stack<Character> st = new Stack<>();
        for( char ch : str.toCharArray()) {
            while (!st.isEmpty() && k>0 && st.peek() > ch) {
                st.pop();
                k--;
            }
            st.push(ch);
        }
            if(k >0){
                while(k>0){
                    st.pop();
                    k--;
                }
            }
            StringBuilder s = new StringBuilder();
            for( int i = 0;i< st.size() ; i++){
            s.append(st.get(i));
        }
            return s.toString();

    }

    public static void main(String[] args) {
        String  str = "1432219";
        System.out.println(removekDigit(str , 3 ));
    }
}
