package leetcode;

public class Number_of_substring_palendrome {
    public static void main(String[] args) {
        String str = "abc";
        int noOfPal= 0 ;
        for( int i = 0 ; i<str.length() ; i++){
            for( int  j =i +1 ;j<= str . length() ; j++){
                noOfPal+=reverse(str.substring(i,j));
            }
        }
        System.out.println(noOfPal);
    }
    public  static  int reverse(String str ) {
       int low = 0 , high  = str .length() -1 ;
       while(low< high ){
           if( str . charAt(low)!=str.charAt(high)){
               return  0 ;
           }
           low++;
           high -- ;

       }
       return  1 ;
    }
}
