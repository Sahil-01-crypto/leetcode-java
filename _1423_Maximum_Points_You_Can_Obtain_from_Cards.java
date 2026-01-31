package leetcode;

import java.util.HashMap;

public class _1423_Maximum_Points_You_Can_Obtain_from_Cards {
    public static  int maxScore( int[] cards ,  int k ){
        int leftScore = 0 , rightScore = 0  , max = 0;
        for( int i=0;i<k;i++){
            leftScore+=cards[i];
        }
        max=leftScore;
        int index = cards.length-1;
        for( int i =k-1;i>=0;i--){
            leftScore-=cards[i];
            rightScore+=cards[index];
        index--;
            max=Math.max(max,leftScore+rightScore);
        }
        return  max ;
    }
    public static void main(String[] args) {
        int cards[] ={1,2,3,4,5,6,1};
        int k  = 3 ;
        System.out.println(maxScore(cards , k ));
    }
}
