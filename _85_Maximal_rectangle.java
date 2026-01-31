package leetcode;

import java.util.Stack;

public class _85_Maximal_rectangle {
    public static int maximalRectangle(int [][] matrix) {
        int n = matrix . length ;
        int m = matrix[0].length ;
        int  max = 0;
        int psum [][]= new int [ n][m];
        for( int j = 0; j<m; j++){
            int sum = 0;
            for( int i = 0;i< n ;i++){
                if( matrix [i][j]==1){
                    sum +=1 ;
                }
                else{
                    sum = 0;
                }
                psum[i][j]= sum ;
            }
        }

        for( int i = 0;i<n;  i++){
            max = Math.max(max , largestRectangleHistogram(psum[i]));
        }
        return max ;
    }
    public static int largestRectangleHistogram(int []height ){
        int n = height .length ;
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for( int i = 0;i<n ; i++){
            while(! st . isEmpty() &&  height [st.peek()]>  height [i]){
                int element = st . peek ();
                st . pop();
                int nse = i;
                int pse = st.isEmpty()? -1 : st . peek();

                int area  = height[element]*( nse - pse -1 );

                max = Math . max( max , area );

            }
            st.push( i );
        }
        while(  ! st.isEmpty()){
            int element = st .peek();
            st . pop();
            int nse = n ;
            int pse = st.isEmpty()? -1 : st . peek();

            int area = height [element]*( nse - pse -1 );

            max = Math . max( max, area );
        }
        return max ;
    }
    public static void main(String[] args) {
        int  arr [] [] = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        System.out.println(maximalRectangle(arr ));

    }
}
