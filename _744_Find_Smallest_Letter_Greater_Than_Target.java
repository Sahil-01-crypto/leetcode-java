package leetcode;

public class _744_Find_Smallest_Letter_Greater_Than_Target {
    public  static  char smallestLatterGrater(char [] letter , int target){
        int low = 0;
        int high = letter.length-1;
        int ans = -1;
        while(low<= high){
            int mid = low+(high - low)/2;
            if((int)letter[mid]>(int)target){
                ans=mid;
                high =  mid -1 ;
            }
            else low = mid+1;
        }
        if( ans ==-1){
            return letter[0];
        }
        return letter[ans];
    }
    public static void main(String[] args) {
        char []  letter = {'c','f','j'};
        int target = 'a';
        System.out.println(smallestLatterGrater(letter , target));
    }
}
