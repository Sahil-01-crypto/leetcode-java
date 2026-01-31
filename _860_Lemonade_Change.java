package leetcode;

public class _860_Lemonade_Change{
    public  static  boolean  lamonadeKing( int[]bills  ){
        int count5 = 0, count10=0 ,count20 = 0;

        for( int i = 0;i< bills .length; i++){
            if( bills [ i]==5){
                count5++;
            }
           else  if( bills [i]==10){
                if( count5>0){
                    count5--;
                    count10++;
                }
                else return  false ;
            }
           else  if( bills [i]== 20 ){
                if( count5>=3){
                    count5-=3 ;
                    count20++;
                }
                else if( count10>=1 &&count5>=1){
                    count5--;
                    count10--;
                    count20 ++;
                }
                else return false  ;
            }
        }
        return  true ;
    }
    public static void main(String[] args) {
        int customer[]= {5,5,10,10,20};
        System.out.println(lamonadeKing(customer));
    }
}
