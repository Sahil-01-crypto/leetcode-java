package leetcode;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Map;

public class _424_Longest_Repeating_Character_Replacement {
    public static  int characterReplacement(String s, int k) {
     Map <Character , Integer> map = new HashMap<>();
     int right = 0, left =0,maxLength =0, maxFreq=0;
     while( right < s.length()){
         char ch = s.charAt(right);
         if( map.containsKey(ch)){
             map . put( ch , map . get(ch)+1);
         }
         else{
             map . put(ch , 1 );
         }
         maxFreq = Math.max(maxFreq, map . get(ch));
         if( (right - left +1)- maxFreq>k){
             char leftchar = s.charAt(left);
             map . put( leftchar,map . get(leftchar)-1);
             left ++ ;
         }
         maxLength = Math .max(maxFreq, right - left +1 );
         right ++ ;
     }
     return maxLength;

    }
    public static void main(String[] args) {
        String str = " AAABBCCD";
        int k = 2 ;
        System.out.println(characterReplacement(str , k ));

    }
}
