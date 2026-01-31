package leetcode;
import java . util . *;
public class _169_Majority_Element {
    // B R U T E    F O R C E
    public int majorityElement(int[] nums) {
        int threshold = nums . length/2;
        for( int i = 0;i< nums . length; i++){
            int count = 0;
            for( int j = 0 ; j<nums.length ; j++){
                if( nums[ i ]== nums [ j ]){
                    count ++;
                }
                if( count > threshold) return nums [ i ];
            }
        }
        return -1;
    }
        public  int majorityElementBetter( int [] nums ){
        Map <Integer, Integer> map = new HashMap<>();
        int threshold= nums.length/2;
        for( int  i = 0;i< nums . length ; i++){
            int current = nums[ i ];
           if( map . containsKey(current)){
               map. put(current , map .get(current)+1 );
           }
           else{
               map . put(current , 1 );
           }
           if( map . get( current)>threshold){
               return current ;
           }
        }
        return -1 ;
        }

        // optimal approch
        public int majorityElementOptimal (int[] nums) {
            int n = nums . length ;
            int count = 0 ;
            int element = 0;
            for(int i = 0;i<n;i++){
                if(count ==0){
                    count = 1;
                    element = nums[i];
                }
                else if (element == nums[i]){
                    count ++ ;
                }
                else{
                    count -- ;
                }
            }
            int thresold = nums. length/ 2;
            int count1 = 0 ;
            for( int i = 0 ;i< nums .length ; i++){
               if(nums[i]==element ){
                   count1 ++;
               }
               if( count1 >thresold) return element;
            }
            return  -1;
        }

    public static void main(String[] args) {
        int nums []= {3,2,3};
        _169_Majority_Element obj = new _169_Majority_Element();
        System.out.println(obj.majorityElement(nums));
        System.out.println(obj . majorityElementBetter(nums));
        System.out.println(obj . majorityElementOptimal(nums ));
        String name = "     sahil";
        System.out.println(name.trim());
    }
}
