package leetcode;
import java.util.ArrayList;
import java . util . List;
public class pascals_yriangle_2 {
    public static List<Integer > generateRow(int  row_num ){
        List<Integer>l1 = new ArrayList<>();
        l1 . add(1);
        int result = 1;
        for(int col = 1 ; col <row_num ; col ++){
            result*=(row_num-col);
            result/=col;
            l1.add(result);
        }
        return l1 ;

    }
    public static void main(String[] args) {
        int row  = 5;
        List <Integer> ans = generateRow(row );
        for(int eelelemt:ans){
            System.out.print(eelelemt+" ");
        }

    }
}
