package leetcode;


import java.util.List;
import java.util.Locale;

class ListNodee{
     int data ;
     ListNodee next ;
     ListNodee(int data ){
         this . data = data ;
     }
 }


public class _19_Remove_Nth_Node_From_End_of_List {

    // OPTIMAL  APPROCH
    public  ListNodee deleteNodeOptimal( ListNodee head , int index ){
        ListNodee fast = head ;
        ListNodee  slow = head ;
        for( int i = 0 ;i<index  ; i++){
            fast = fast.next ;

        }
        if( fast == null ){
             return head .next ;
        }
        while( fast.next != null ){
            fast = fast .next;
            slow  = slow .next ;

        }
        slow .next = slow .next .next ;
        return head ;

    }

    // BRUTE FORCE APPROCH

    public    ListNodee deleteNode(ListNodee head , int index  ) {
      int count = 0;
      ListNodee temp = head ;
      while( temp != null ){
          count ++;
          temp = temp.next;
      }
      if( index == count ){
     return  head . next ;
        }
      int m = count - index ;

      temp = head ;
     for( int i = 1 ; i< m; i++){
         temp = temp.next;
      }
     temp .next= temp.next.next;
     return head ;
    }
     public static  void display(ListNodee  head ){
        ListNodee temp = head ;
        while(  temp != null ){
            System.out.print( temp . data +" ");
             temp = temp . next ;
        }
         System.out.println();
     }
    public static void main(String[] args) {
        ListNodee a = new ListNodee(1);
        ListNodee b = new ListNodee(2);
        ListNodee c = new ListNodee(3);
        ListNodee d = new ListNodee(4);
        ListNodee e = new ListNodee(5);
        a.next = b ;
        b. next = c ;
        c.next = d ;
        d.next = e;
        _19_Remove_Nth_Node_From_End_of_List obj = new _19_Remove_Nth_Node_From_End_of_List();
//        a =  obj . deleteNode(a, 2);
         a= obj . deleteNodeOptimal(a ,5);
         display( a );

    }
}
