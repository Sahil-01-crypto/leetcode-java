package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _3_Longest_Substring_Without_aRepeating_Characters {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> map = new HashMap<>();
       int right =0,left =0 , max=0;
      while( right < s.length() ){
          char ch = s . charAt(right );
          if( map . containsKey(ch)){
              left = Math.max(left , map .get(ch)+1);
          }
          map . put(ch ,right );

          max = Math. max(max , right - left +1 );
          right ++;
      }
      return  max  ;
    }
    public static void main(String[] args) {
        String str = "pwwkew";
        _3_Longest_Substring_Without_aRepeating_Characters obj = new _3_Longest_Substring_Without_aRepeating_Characters();

        System.out.println(obj . lengthOfLongestSubstring(str ));
    }
}
