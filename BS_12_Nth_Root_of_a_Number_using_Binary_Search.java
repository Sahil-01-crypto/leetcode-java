package leetcode;

public class BS_12_Nth_Root_of_a_Number_using_Binary_Search {
    public static  int calculateRoot(int N , int M ){
        int low = 1 ;
        int high = M ;
        while(low<= high ){
            int mid = low +(high - low )/2;

            
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int N= 3 ;
        int M = 27 ;
        System.out.println(calculateRoot(N , M ));

    }
}
