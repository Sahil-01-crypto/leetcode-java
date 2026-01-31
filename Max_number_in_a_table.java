package leetcode;

import java.util.HashSet;

public class Max_number_in_a_table {
    public static  int maxNumber( int arr[]){
        HashSet<Integer> set = new HashSet<>();
        int max_count = 0;
        for( int i = 0 ; i<arr.length ; i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else{
                set.add(arr[i]);
                max_count = Math . max(max_count , set.size());
            }
        }
         return  max_count;
    }
    public static void main(String[] args) {
        int arr [ ] = {2,1,1,3,2,3};
        System.out.println(maxNumber(arr));
    }
}
