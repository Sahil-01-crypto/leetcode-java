package leetcode;
import java . util . Arrays ;
public class _455_Assign_Cookies {
    public static int findContentChildren(int[] g, int[] s) {
        int child = 0 ;
        int cookie = 0;
        int count = 0;
        while(child <g.length &&  cookie<s.length){
            if(g[child]<=s[cookie]) {
                count++;
                child ++;
            }
            cookie ++;

        }
        return  count ;
    }
    public static void main(String[] args) {
        int []g ={1,2};
        int []s = {1,2,3};
        System.out.println(findContentChildren(g ,s ));
    }
}
