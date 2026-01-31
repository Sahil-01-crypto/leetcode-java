package leetcode;

public class Toggle_Character_Of_String {
    public  static  String toggleCharacter(String str ){
        StringBuilder st = new StringBuilder(str);
        for( int i = 0;i<st.length() ; i++){
            int ch = (int)(str.charAt(i));
            if(ch <97){
                char newch = (char )(ch+32);
                st.setCharAt(i,newch);
            }
            else{
                char chnew  = (char)(ch-32);
                st . setCharAt(i , chnew );
            }
        }
        return  st .toString();
    }
    public static void main(String[] args) {
        String str = "SNEHA";
        System.out.println(toggleCharacter(str));
    }
}
