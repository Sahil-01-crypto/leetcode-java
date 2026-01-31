package leetcode;

import java.util.Stack;

class QImplementation{
    Stack<Integer> st =  new Stack<>();
    Stack<Integer>st2 = new Stack<>();
public void  push(int x){
    while( ! st . isEmpty()){
        st2.push(st.pop());
    }
    st.push(x);
    while(!st2.isEmpty()){
        st.push(st2.pop());
    }
}
public  int pop(){
    return st . pop();
}
public  int peek(){
    return st . peek();
}
public int size(){
    return st.size();
}
public boolean  isEmpty(){
    return  st . isEmpty();
}

}
public class Implement_Queue_using_Stack {
    public static void main(String[] args) {
        QImplementation obj =new QImplementation();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);

        System.out.println("Top of the stack: " + obj.peek());
        System.out.println("Size of the stack before removing elemengt: " + obj.size());
        System.out.println("The deleted element is: " + obj.pop());
        System.out.println("Top of the stack after removing element: " + obj.peek());
        System.out.println("Size of the stack after removing element: " + obj.size());
        System.out.println(" is Stack  empty : "+obj.isEmpty());

    }
}
