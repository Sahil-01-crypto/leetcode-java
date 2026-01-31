package leetcode;

public class ereverse_each_word {
    public  static   String reverse( String str ){
        StringBuilder s =  new StringBuilder("");
        String ans = "";
        for( int  i = 0; i<str.length();i++){
            if(str.charAt(i)==' '){
                s.reverse();
                ans = ans +s;
                ans+= " ";
                s.delete(0,str.length());

            }
            else{
                s.append(str.charAt(i));
            }
        }
        s.reverse();

        ans+= s;
        return ans ;
    }
    public static void main(String[] args) {
        String str = "I am an educator";
        System.out.println(reverse(str));
    }
}
