package leetcode;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class _316_Remove_Duplicate_Letters {
    public  static  String removeDuplicate( String str){
        Stack<Character> st = new Stack<>();
        Set<Character> set = new HashSet<>();
        int []  last = new int[26];
        for( int i = 0 ;i<str.length() ; i++) {
            last[str.charAt(i) - 'a'] = i;
        }
        for( int i = 0; i< str.length() ; i++) {
            char ch = str.charAt(i);
            if (set.contains(ch)) {
                continue;
            }
            while (!st.isEmpty() && st.peek() >= ch && last[st.peek() - 'a'] > i) {
                char remove = st.pop();
                set.remove(remove);
            }
            st.push(ch);
            set.remove(ch);
        }
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        String str = "cbacdcbc";
        System.out.println(removeDuplicate( str));
        }
    }

