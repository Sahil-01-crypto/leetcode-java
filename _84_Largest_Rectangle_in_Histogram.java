package leetcode;

import java.util.Stack;

public class _84_Largest_Rectangle_in_Histogram {
    // O P T I M A L    S O L U T I O N
     public static  int largestRectangleOPtimal( int[] heights) {
         Stack<Integer> st = new Stack<>();
         int n = heights.length;
         int max = 0;
         for( int i = 0;i<n; i++){
             while( !st.isEmpty() && heights[st.peek()]>=heights[i]){
                 int element =st.pop();
                 int nse = i ;
                 int pse = st.isEmpty()? -1 : st.peek();

                 int area = heights[element]*(nse - pse -1 );
                 max= Math.max(max, area );
             }
             st.push(i);
         }
         while( ! st.isEmpty()){
             int element = st.pop();
             int nse = n ;
             int pse = st.isEmpty()? -1:st.peek();

             int area =heights[element]*( nse - pse -1) ;
             max= Math.max(max , area);
         }
         return max;
     }
    // B R U T E   F O R C E
    public static  int largestRectangle(int heights []){
        int pse []=finfPse(heights);
        int nse []=finfNse(heights);
        int max = 0;
        for( int i= 0;i<heights .length ;i++){
            int left = pse[i];
            int right = nse[i];
            int area = heights[i]*(right- left -1 );
            max = Math . max(max , area );
        }
         return  max ;
    }
    public  static  int [] finfPse(int [] arr ){
        Stack <Integer> st = new Stack<>();
        int pse [] = new int[arr.length];
        for( int i = 0 ; i< arr.length ; i++){
            while( ! st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }

            pse[i]= st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        return  pse ;
    }
    public  static  int [] finfNse( int arr [ ]){
        Stack<Integer > st = new Stack<>();
        int nse [ ] = new int[arr.length];
        for(int i = arr.length -1 ; i>=0 ; i --){
            while( ! st.isEmpty() && arr[st.peek()]> arr[i]){
                st.pop();
            }

            nse [ i ]= st.isEmpty()? arr.length : st.peek();
            st.push(i);
        }
         return  nse ;
    }
    public static void main(String[] args) {
        int heights []= {2,1,5,6,2,3};
        System.out.println(largestRectangleOPtimal(heights));
    }
}
