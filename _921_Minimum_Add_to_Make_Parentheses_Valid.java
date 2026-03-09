package leetcode;

import java.util.Stack;

public class _921_Minimum_Add_to_Make_Parentheses_Valid {
    public  static int minAddToMakeValid( String str ){
        int add=0;
        Stack<Character> st = new Stack<>();
        for ( int i = 0 ;i< str.length();i++){
            char ch = str . charAt(i);
            if( ch=='('){
                st.push(ch);
            }
            else{
                if(!st.isEmpty()) st . pop();
                else add++;
            }
        }
        return  add+ st.size();
    }
    public static  int minAddToMakeValidOPT( String str){
        //     OPTIMAL APPROCH
        int open = 0 ;
        int  add = 0 ;
        for( int i = 0;i< str.length() ; i++){
            char ch = str.charAt(i);
            if( ch=='(') open++;
            else{
                if(open>0) open-- ;
                else{
                    add++;
                }
            }
        }
        return open+add;
    }
    public static void main(String[] args) {
        String str = ")()(";
        System.out.println(minAddToMakeValidOPT(str ));
        System.out.println(minAddToMakeValid(str ));
    }
}
