package leetcode;

import java.util.HashMap;

public class _205_Isomorphic_Strings {
    public  static  boolean isIsomorphic( String s , String t ){
        HashMap<Character , Character > map = new HashMap<>();
        for( int i = 0 ; i <s.length(); i++){
            Character Sch = s.charAt(i);
            Character Tch = t.charAt(i);

            if( map .containsKey(Sch)){
                if(map.get(Sch)!= Tch){
                    return false ;
                }
            }
            else  if( map.containsValue(Tch )){
                return  false ;
            }
            else{
                map . put(Sch , Tch );
            }

        }
         return  true ;
    }
    public static void main(String[] args) {
        String s = "egg";
        String t  = "add";
        System.out.println(isIsomorphic(s , t ));
    }
}
