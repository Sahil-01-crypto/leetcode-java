package leetcode;

import java.util.HashMap;

public class _242_Valid_Anagram {
    public static  boolean isAnagram(String s , String t ){
        if( s.length() != t.length()) return false ;

        HashMap<Character, Integer> map  = freqmap(s);
        for( char ch :t.toCharArray()){
            if( ! map.containsKey(ch)){
                return false ;
            }
            else{
                int count = map.get(ch)-1;
                if( count==0){
                    map.remove(ch);
                }
                else{
                    map.put(ch,count);
                }
            }
        }
        return true ;

    }
    public static  HashMap<Character , Integer> freqmap(  String s ){
        HashMap<Character,Integer> mp = new HashMap<>();
        for( char ch : s.toCharArray()){
            if( ! mp .containsKey(ch) ){
                mp.put(ch, 1 );
            }
            else{
                mp.put(ch , mp.get(ch)+1);
            }
        }
        return  mp ;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s , t ));
    }
}
