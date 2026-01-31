package leetcode;


import java.util.Stack;


public class _901_Online_Stock_Span {
    public static  int [] next(int [] price ){
      Stack<Integer> st = new Stack<>();
      int [] arr2 = new int[price.length] ;
      for( int i = 0;i<price.length ; i++){
          while(!st.isEmpty() &&  price[st.peek()]<=price[i]){
              st . pop();
          }
          arr2[i] = st.isEmpty()?1:i-st.peek();
          st.push(i) ;
      }
      return  arr2  ;
    }
    public static void main(String[] args) {
        int arr[] = {100, 80, 60, 70, 60, 75, 85};
        int [] ans = next(arr);
        for (int p : ans ) {
            System.out.print(p+ " ");
        }
        // Expected Output: 1 1 1 2 1 4 6 
    }
}
