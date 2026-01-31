package leetcode;

import java.util.Stack;

public class next_greater_element_1 {
    public  static  int [ ] nextGreaterElement ( int [ ] arr){
        Stack<Integer > st = new Stack<>();
        int ans [ ] = new int[arr.length];
        int n = arr.length;

        for( int i = n -1   ; i >= 0 ;i--){
            while( ! st . isEmpty() && st . peek()<=arr [ i ]){
                st . pop();
            }
            ans [ i ]= st . isEmpty()? -1 : st . peek() ;
            st . push( arr [ i ]);
        }
        return  ans;
    }
    public static void main(String[] args) {
        int arr [ ]= {1,3,2,1,8,6,3,4};
        int newArr[]= nextGreaterElement(arr);
        for( int val : newArr){
            System.out.print(val +"  ");
        }
    }
}
