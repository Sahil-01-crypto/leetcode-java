package leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Stimplementation {
 Queue<Integer> q = new LinkedList<>();
 public  void push( int x ){
     q.offer(x);
    for( int i = 0;i<q.size()-1 ; i++){
         q.offer(q.poll());
     }
 }
 public  int pop(){
     return q.poll();
 }
 public int top(){
     return q.peek();
 }
 public int size( ){
     return q . size();
 }
 public boolean isEmpty(){
     return q . isEmpty();
 }
}
public class _225_Implement_Stack_using_Queues {
    public static void main(String[] args) {
//        Stack<Integer> st  = new Stack<>();
        Stimplementation st = new Stimplementation();
        st . push(5);
        st . push(6 );
        st.push(7);
        st.push(8);

        System.out.println("Top of the stack: " + st.top());
        System.out.println("Size of the stack before removing element: " + st.size());
        System.out.println("The deleted element is: " + st.pop());
        System.out.println("Top of the stack after removing element: " + st.top());
        System.out.println("Size of the stack after removing element: " + st.size());
        System.out.println(" is Stack  empty : "+st.isEmpty());
    }
}
