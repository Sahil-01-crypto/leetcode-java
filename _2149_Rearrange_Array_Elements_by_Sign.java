package leetcode;

//Problem Statement:
//
//There’s an array ‘A’ of size ‘N’ with an equal number of positive and negative elements.
// Without altering the relative order of positive and negative elements, you must return
// an array of alternately positive and negative values.
//Note: Start the array with positive elements.



public class _2149_Rearrange_Array_Elements_by_Sign {
    public int[] rearrangeArray(int[] nums) {

//        BRUTE FORCE


//        int num_e[] = new int[nums.length / 2];
//        int num_o[] = new int[nums.length / 2];
//        int e_i = 0;
//        int n_o = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > 0) {
//                num_e[e_i++] = nums[i];
//
//            } else {
//                num_o[n_o++] = nums[i];
//            }
//        }
//       for(int  i =0;i<nums.length/2;i++){
//           nums[2*i]=num_e[i];
//           nums[2*i+1]=num_o[i];
//       }
//
//        return nums;

        //OPTIMISED METHOD
        int pos = 0, neg = 1;
        int arr[]= new int[nums.length];
        for(int i = 0 ;i<nums.length; i++){
            if(nums[i]>0){
                arr[pos]=nums[i];
                pos+=2;
            }
            else if (nums [ i]<0){
                arr[neg]= nums [ i];
                neg +=2;
            }
        }
        return arr   ;
    }


    public static void main(String[] args) {
        int nums[]={3,1,-2,-5,2,-4};
        _2149_Rearrange_Array_Elements_by_Sign obj = new _2149_Rearrange_Array_Elements_by_Sign();
        int []newnums=obj.rearrangeArray(nums);
        for(int  element :newnums){
            System.out.print(element+" ");
        }

    }
}
