package leetcode;

public class _45_Jump_Game_II {
    public static  int jump( int arr []){
        int jump = 0;
        int right = 0 , left  = 0 ;
        while( right< arr.length-1){
            int farthest = 0;
            for( int   i = left ; i<= right ; i++ ){
                farthest = Math .max(farthest , i+ arr [ i]);
            }
            left = right+1 ;
            right= farthest;
            jump++;
        }
        return  jump ;
    }
    public static void main(String[] args) {
        int arr [ ] = { 2,3,1,1,4};
        System.out.println(jump(arr ));

    }
}
