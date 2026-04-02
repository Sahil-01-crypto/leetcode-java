package leetcode;

import java.util.HashMap;

public class _904_fruits_in_a_basket {
    public  static int totalFruit(int[] fruits) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int left = 0 ;
        int right = 0 ;
        int maxi = 0 ;
        while(right<fruits.length){
            if(map . containsKey(fruits[right])){
                map . put( fruits[right] , map.get(fruits[right])+1);
            }
            else{
                map.put(( fruits[right]) , 1);
            }

//            shrink the array
            while( map.size()>2){
                if(map.containsKey(fruits[left])){
                    map.put(fruits[left],map.get(fruits[left])-1);
                }
                if(map . get(fruits[left])==0){
                    map . remove(fruits[left]);
                }
                left++;
            }
            maxi = Math.max(maxi , right - left+1);
            right++;
        }
        return  maxi;
    }
    public static void main(String[] args) {
        int []  fruits ={1,2,3,2,2};
        System.out.println(totalFruit(fruits));
    }
}
