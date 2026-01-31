package leetcode;

public class _231_Power_of_Two {
    public static boolean isPowerOfTwo(int n) {
        if( n==0 ){
             return true ;
        }
        isPowerOfTwo(n%2);
        return false ;


    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(15));
    }
}
