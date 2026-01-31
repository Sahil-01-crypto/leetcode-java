package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

class LNode {
    int data;
    LNode next;

    LNode(int data) {
        this.data = data;
    }
}
class Linkedlist {
    public  LNode OddEven(LNode head ){
    ArrayList <Integer> l1 = new ArrayList<>();
    LNode temp = head ;
    while(temp != null && temp . next != null ){
        l1.add(temp . data );
        temp  = temp . next . next ;
    }
    if(temp != null ){
        l1 . add(temp . data );
    }
    LNode t = head . next ;
    while(t != null && t . next != null ){
        l1.add(t.data);
        t= t.next . next ;
    }
    if(t != null ){
        l1 . add (t . data );
    }
    int i = 0 ;
    LNode tt = head ;
    while(tt != null ){
        tt.data = l1.get(i);
        i++;
        tt= tt . next;
    }
    return head;
}
}
public class _328_Odd_Even_Linked_List {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        LNode head = new LNode(arr[0]);
        head . next = new LNode(arr[1]);
        head . next . next = new LNode(arr[2]);
        head . next. next. next= new LNode(arr[3]);
        head . next.next.next.next= new LNode(arr[4]);
       LinkedList obj = new LinkedList();

    }
}
