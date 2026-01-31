package leetcode;

//import java.lang.classfile.instruction.LineNumber;
//import java.util.LinkedList;

class NOAD  {
    int data ;
    NOAD next ;
    NOAD(int data ){
        this . data = data ;
    }
}
class LList  {
     public  NOAD delMiddle(NOAD head ) {
          if ( head == null || head . next == null ) return null ;
         NOAD fast =  head ;
         NOAD slow = head  ;
          fast =  fast .next ;
        NOAD prev = null ;
        while( fast != null &&fast . next != null ){
             fast =   fast . next . next ;
             prev = slow ;
             slow = slow . next ;

        }
        if( prev != null ) {
            prev.next = slow.next;
        }
        else{
            head = head . next ;
        }
         return head ;
     }
     public void display(NOAD head ){
         NOAD temp = head ;
         while(temp != null ){
             System.out.print(temp.data+" ");
             temp = temp . next;
         }
     }
}
public class _2095_Delete_the_Middle_Node_of_a_Linked_List {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,6};
        NOAD head = new NOAD(arr[0]);
        head.next = new NOAD(arr[1]);
        head.next.next = new NOAD(arr[2]);
        head.next.next.next = new NOAD(arr[3]);
        head.next.next.next.next = new NOAD(arr[4]);
        head.next.next.next.next.next = new NOAD(arr[5]);
        LList obhj = new LList();
         head = obhj .delMiddle(head );
         obhj.display(head );
    }
}
