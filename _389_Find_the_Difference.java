package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class _389_Find_the_Difference {
    public  static  char findTheDifference( String s , String t ) {
        HashMap< Character , Integer > map = new HashMap<>();

        for( char ch : s.toCharArray()){
            if(! map .  containsKey(ch)){
                map .put(ch,1);
            }
            else{
                map . put(ch , map.get(ch)+1 );
            }

        }
        for( char ch : t .toCharArray()){
            if(! map .containsKey(ch)){
                return ch ;
            }
            int count =  map .get(ch)-1 ;
            if(count ==0){
                map.remove(ch);
            }
            else{
                map .put( ch , count );
            }
        }
        return 0;
    }
    public static void main(String[] args) {
      String s = "aa";
      String t = "aaa";
        System.out.println(findTheDifference(s , t ));
    }
}
