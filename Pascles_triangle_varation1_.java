package leetcode;

public class Pascles_triangle_varation1_ {
    int  ncr(int n , int r ){
        int result = 1;
        for(int i = 0;i<r;i++){
            result= result*(n-i);
            result = result/(i+1);
        }
        return result;
    }
    int pasclesTriangle(int row , int col ){
        int n= row -1;
        int r = col -1;
        int element=ncr(n , r );
        return element ;
    }
    public static void main(String[] args) {
        int row = 5;
        int col = 3;
        Pascles_triangle_varation1_ obj = new Pascles_triangle_varation1_();
        System.out.println(obj.pasclesTriangle(row,col));
    }
}
