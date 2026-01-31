package leetcode;

import java.util.HashMap;
import java.util.Map;

public class _340_Longest_Substring_with_At_Most_K_Distinct_Characters {
    public  static  int longestSbStringOptimal( String s , int k ){
        HashMap<Character, Integer> map = new HashMap<>();
        int right = 0 , left = 0 , max = 0;
        while( right<s . length()){
            char ch = s . charAt(right );
            if( map .containsKey(ch)) map . put( ch , map . get( ch ) +1 );
            else map . put( ch , 1 );
            while( map . size() > k){
                char leftchar = s . charAt( left);
                map . put( leftchar , map . get(leftchar)-1 );
                if( map . get( leftchar)== 0 ) {
                    map.remove(leftchar);
                }
                    left++;
            }
            max = Math . max( max , right - left + 1 );
            right++;
        }
        return max ;
    }
    //B R U T E    F O R C E
    public  static  int longestSbString( String s , int k ){
        HashMap<Character , Integer> map = new HashMap<>();
       int max = 0;
       for( int  i = 0 ; i< s .length(); i++){
           map .clear();
           for( int j = i ; j< s .length() ; j++){
               char ch = s .charAt(j);
               if( map . containsKey(ch)) map. put(ch , map . get(ch)+1 );
               else map . put(ch , 1 );
               if( map .size()==k)
                   max = Math . max( max , j- i +1 );
           }
       }
       return  max ;
    }
    public static void main(String[] args) {
        String s ="eceba";
        int k = 2 ;
        System.out.println(longestSbStringOptimal(s , k ));
    }
}
