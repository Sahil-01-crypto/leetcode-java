package leetcode;


import java.util.*;

 class tuf {
    public static List<Integer> generateRow(int row) {
        List<Integer>temp= new ArrayList<>();
        temp.add(1);
        int result = 1 ;
        for(int col = 1 ; col <row;col ++){
            result= result*(row  - col );
            result= result/ col ;
            temp.add(result);
        }
        return temp;
    }
    public  static List<List<Integer>>pascalTriangle(int numrow ) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 1 ;i<= numrow; i++){
            ans .add(generateRow(i));
        }
        return ans  ;
    }


    public static void main(String[] args) {
       int row = 5;
       List<List<Integer>>ans =tuf. pascalTriangle(row);
       for(List<Integer> it :ans ){
           for(int element :it ){
               System.out.print(element+" ");
           }
           System.out.println();

        }
    }
}
