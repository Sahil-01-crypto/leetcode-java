package leetcode;

import java.util.ArrayList;

class LNodes {
    int data ;
    node next ;
    LNodes(int data ){
         this . data = data ;
    }
}
public class _203_remove_linked_list_element {

    // optimal
    public  static node removeElementoptimal(node head , int key ){
        node dummy = new node(-1 );
        node temp = dummy ;
        node t1 = head;
        while( t1 != null ){
            if( t1 .data  != key ){
                temp . next = t1 ;
                t1 = t1 .next;
                temp = temp . next;
            }
            else{
                t1 = t1 .next;
            }
             temp.next = null ;
        }
         return dummy.next;
    }
    public  static node removeElement(node head , int key ){
        ArrayList<Integer> temp = new ArrayList<>();
        node t = head ;
        while( t != null ){
            if( t . data != key ){
                temp . add( t.data);
            }
             t = t . next ;
        }
        if( temp .size() == 0 ){
            return  null;
        }
        node ansHead = new node(temp.get(0));
        node curr = ansHead;
        for( int i = 1 ; i< temp.size() ; i ++){
            curr .next = new node(temp .get(i));
            curr = curr . next;
        }
         return ansHead;


    }
    public static  void  display( node head ){
        node temp = head ;
        while( temp != null ){
            System.out.print(temp .data+"  ");
            temp = temp . next;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,5,4,6};
        node head = new node(arr[0]);
        head . next = new node(arr[1]);
        head . next . next = new node(arr[2]);
        head . next. next. next= new node(arr[3]);
        head . next.next.next.next= new node(arr[4]);
//        head = removeElement(head , 5);
        head = removeElementoptimal(head,5);
        display(head );


    }
}
