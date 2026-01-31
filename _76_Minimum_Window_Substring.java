package leetcode;

import javax.naming.ldap.HasControls;
import java.util.HashMap;
import java.util.Map;

public class _76_Minimum_Window_Substring {
    public static String minWindow(String s, String t) {
        Map <Character , Integer> map = new HashMap<>();
        for( char ch : t.toCharArray()){
            if( map . containsKey(ch))  map . put( ch , map . get(ch)+1);
            else map . put( ch , 1 );
        }
        String result ="";
        int min = Integer . MAX_VALUE;
        for( int i = 0 ;i< s . length() ; i++){
            Map<Character, Integer> windowMap = new HashMap<>(map ); // copy of map
            for( int j = i ; j< s .length() ; j++){
                char ch = s .charAt(j);
                if( windowMap.containsKey(ch)) windowMap. put( ch ,windowMap . get( ch)-1 );
                if( windowMap.get( ch )==0)  windowMap . remove( ch );

                // if map zide is 0
                if( map . size() == 0){
                    int length = j-i+1 ;
                    min = Math . min(min , length);
                    result = s . substring(i , j+1);

                    break ;
                }

            }
        }
         return result  ;
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s , t ));
    }
}
