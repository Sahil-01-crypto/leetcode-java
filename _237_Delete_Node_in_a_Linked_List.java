package leetcode;

import java.util.List;

import static leetcode.ListNode.delete;
import static leetcode.ListNode.display;

//Definition for singly-linked list.
 class ListNode{
     int data;
     ListNode next;
     ListNode(int data ){
         this . data = data ;
     }

 public static void  delete(ListNode node){
         node . data  = node . next . data  ;
         node . next = node . next .next;

 }
 public static  void display(ListNode  head ) {
     ListNode temp = head ;
     while (temp != null) {
         System.out.println(temp.data + " ");
         temp = temp.next;
     }
 }
}
class Dsa{
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c  = new ListNode(3);
        ListNode d = new ListNode(4);
        a.next= b ;
        b.next= c ;
        c.next= d ;
        ListNode temp = a;
        System.out.println("before deletion  ");
        display(a);
        delete(b);
        System.out.println("after  deletion ");
        display(a);



    }
}


