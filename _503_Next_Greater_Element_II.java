package leetcode;

import java.util.Stack;

public class _503_Next_Greater_Element_II {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int ans [] = new int[nums .length];
         int n = nums . length ;
        for( int i = 2*n-1 ; i>=0 ; i--){
            while( ! st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(i<n){
                ans[i]= st.isEmpty()?-1:st.peek();
            }
            st.push(nums [i%n]);
        }
        return ans ;

    }
    public static void main(String[] args) {
        int arr[]= {1,2,1};
        _503_Next_Greater_Element_II obj = new _503_Next_Greater_Element_II();
        int ans []= obj.nextGreaterElements(arr );
        for( int  data : ans ){
            System.out.print(data+" ");
        }

    }
}
