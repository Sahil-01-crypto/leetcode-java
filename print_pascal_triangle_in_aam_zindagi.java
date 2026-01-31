package leetcode;

public class print_pascal_triangle_in_aam_zindagi {
    public static void printPascals(int  n ){
        for(int row = 0 ; row < n ; row ++){
            int result  = 1 ;
            for(int  col = 0 ; col <=row ; col ++){
                if(col==0){
                    System.out.print(1 +" ");
                }
                else {
                    result = result*(row-col+1);
                    result= result/col;
                    System.out.print(result+ " ");
                }


            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int  n = 5;
        printPascals(n);

    }
}
