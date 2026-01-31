package leetcode;

public class BS_11_Finding_Sqrt_of_a_number_using_Binary_Search {
    public static  int sqrt(int num ) {
        if(num<2 ){
            return num ;
        }
        int low = 1 ;
        int high = num ;

        while(low<= high ){
            long mid =(low +high)/2 ;
            long val  = mid * mid ;
            if(val <= (long)num   ){
                low = (int )mid +1 ;
            }
            else if(val>(long)num){
                high =(int ) mid -1 ;
            }
        }
        return high ;
    }
    public static void main(String[] args) {
        int num = 50  ;
        System.out.println(sqrt(num));

    }
}
