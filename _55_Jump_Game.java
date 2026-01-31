package leetcode;

public class _55_Jump_Game {
    public static  boolean canJump(int[] nums) {
        int maxIndex = 0;
        for( int i = 0;i< nums . length ; i++){
            if( maxIndex<i)  return  false ;
            maxIndex= Math.max(maxIndex, i+nums [ i ]);
        }
        return  true ;
    }
    public static void main(String[] args) {
        int nums [] = {1,2,3,1,1,0,2,5};
        System.out.println(canJump(nums ));
    }
}
