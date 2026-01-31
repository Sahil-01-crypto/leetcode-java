package leetcode;

public class _443_string_compression {
    public static void main(String[] args) {
        char chars  [] ={'a','a','b','b','b'};
        String str = "";
        str+=chars[0];
        int count = 1 ;
        for(int i = 1 ; i< chars . length  ; i++){
            char curr =  chars [ i ];
            char prev = chars [ i-1 ];
            if( curr== prev){
                count++;
            }
            else{
                if(count>1)
                    str+=count ;
                str+= curr ;
                count = 1 ;
            }
        }
        if( count > 1){
            str+= count ;

        }
        System.out.println(str );
    }
}
