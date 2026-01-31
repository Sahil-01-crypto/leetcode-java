package leetcode;

public class _540_Single_Element_in_a_Sorted_Array {

//    B R U T E   F O R C E   M E T H O D

//    public int singleNonDuplicate(int[] nums) {
//        if(nums.length==1){
//            return nums [ 0 ];
//        }
//        for(int i = 0;i<nums.length; i++){
//            // check at the  first element
//            if(i==0){
//                if(nums [ i ]!=nums [ i +1]){
//                    return  nums [ i ];
//                }
//            }
////            check for the last  element
//            else if(i==nums.length-1 ){
//                if(nums[ i ]!=nums [ i -1 ]){
//                    return nums [ i ];
//                }
//            }
//            else{
//                if(nums[i]!=nums[ i -1 ] &&nums [ i ]!=nums[ i +1 ]){
//                     return nums [ i ];
//                }
//
//            }
//
//
//        }
//        return -1 ;
//
//    }
//    ***************************************************************************

//      O P T I M A L  A P P R O C H

    public int singleNonDuplicate(int arr[]){
        int n = arr.length;
        if(n==1)
            return arr[0];
        if(arr[0]!=arr[1]){
            return arr[0];
        }
        if(arr[n-1]!=arr[n-2]) {
            return arr[n - 1];
        }
        int low = 1;
        int high = n-2;
        while(low<= high ){
//            calculate the middle
            int  mid = low +(high - low )/2 ;

            if(arr[mid ]!=arr[mid -1 ] && arr[mid]!=arr[mid+1]){
                return arr[ mid ];
            }
            else if((mid % 2 ==0 && arr[mid ]== arr[ mid +1 ]) ||
                    (mid % 2 ==1 && arr[mid]== arr [ mid -1 ])){
                low = mid +1 ;
            }
            else {
                high = mid -1  ;
            }
        }
        return  -1 ;
    }
    public static void main(String[] args) {
        int arr[]={1,1,2,2,3,3,4,4,5,5,44496,6,6,7,7,8,8};
        _540_Single_Element_in_a_Sorted_Array obj = new _540_Single_Element_in_a_Sorted_Array();
        System.out.println(obj.singleNonDuplicate(arr));
    }
}
