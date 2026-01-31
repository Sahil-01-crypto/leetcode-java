package leetcode;

import java.util.ArrayList;
import java.util.HashSet;

class Nde {
    Nde prev ;
    int data ;
    Nde next ;
    Nde(int data ){
        this . data =  data;
    }
}
public class remove_duplicates_of_a_sorted_DLL {
    public static  Nde removeDuplicate(Nde head ){
       Nde temp = head;
       while( temp != null && temp.next !=  null ){
           Nde nextNode = temp . next ;
          while(nextNode != null  && nextNode.data == temp.data){
              nextNode = nextNode . next ;
          }

               temp . next = nextNode;
           if (nextNode != null)
               nextNode. prev = temp ;
            temp = temp . next;
           }
        return head ;

    }
    public  static  void display(Nde head ){
        Nde temp = head ;
        while( temp != null ){
            System.out.print(temp .data+" ");
            temp = temp .next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Nde a = new Nde(1);
        Nde b = new Nde(1);
        Nde c = new Nde(3);
        Nde d = new Nde(3);
        Nde e = new Nde(5);
        Nde f = new Nde(6);
        a.next = b ;
        b.prev = a ;
        b.next = c ;
        c.prev = b ;
        c.next= d ;
        d.prev = c ;
        d.next=e;
        e.prev=d;
        e.next = f;
        a= removeDuplicate(a );
        display( a );

    }
}
