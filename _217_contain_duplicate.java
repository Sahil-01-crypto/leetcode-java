package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class _217_contain_duplicate {
    // BRUTE FORCEEE   TC - O(n^2)
    public static  boolean containDuplicate(int arr[]){
        boolean contain= false ;
        for( int i = 0 ; i<arr.length-1  ;i++){
            for( int j =i+1 ; j<arr.length ; j++){
                if( arr[i]== arr[j]){
                    return true ;
                }
            }
        }
         return false ;

    }
    // BETTER SOL  TC - On+(nlogn)
    public static  boolean containDuplicateBETTER(int arr[]){
        Arrays.sort(arr);
        for( int i = 0 ;i< arr.length -1 ; i++ ){
            if( arr[ i ]== arr[ i+1 ]){
                return true ;
            }
        }
         return false ;
    }
    // MUCH BETTER   TC - O(2n)   sc- o(n)
    public static  boolean containDuplicateBETTERPLUS(int arr[]){
        HashMap<Integer , Integer > map = new HashMap<>();
        for( int i = 0 ;i<arr.length ; i++){
            if( ! map .containsKey(arr[i])){
                map .put(arr[i],1);
            }
            else{
                map .put(arr[i], map .get(arr[i])+1);
            }
        }

        for(Integer key : map . keySet()){
            if(map.get(key)>1 ){
                return true ;
            }
        }
        return  false ;
    }
    public static  boolean containDuplicateBETTERPLUSbest(int arr[]){
        HashSet<Integer> hs = new HashSet<>();
        for( int val : arr){
            if( hs.contains(val)){
                return true ;
            }
            else{
                hs.add(val);
            }
        }
        return false ;
    }
    public static void main(String[] args) {
        int arr [ ]= {1,2,3,4,5,8,9};
        System.out.println(containDuplicateBETTERPLUSbest(arr));
    }
}
