package leetcode;

public class _2264_Largest_3_Same_Digit_Number_in_String {
    public  static String largestGoodInteger(String num) {
        String ans = "";
        for( int i = 2; i< num . length() ; i++){
            if( num.charAt(i)== num.charAt(i-1) && num.charAt(i)== num.charAt(i-2)){
                String temp = ""+num.charAt(i)+num.charAt(i)+num.charAt(i);

                if( ans.compareTo(temp)<0){
                    ans = temp ;
                }
            }
        }
        return ans ;
    }
    public static void main(String[] args) {
        String str ="6777133339";
        System.out.println(largestGoodInteger(str ));
    }
}
