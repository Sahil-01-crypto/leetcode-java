package leetcode;
import java.util.List;
import  java . util . Stack ;
class Nodde {
    int data;
    Nodde next ;
    Nodde(int data ){
        this . data =data ;
    }
}
public class _234_palendrone_linked_list {
    // OPTIMAL CODE
    public static  boolean isPalindromeOptimal (Nodde  head) {

        Nodde  mid = findMid(head);
        Nodde  t2 = mid . next ;
        mid . next = null ;
        Nodde head2 = reverse(t2 );
        Nodde pointer1 = head ;
        Nodde pointer2 = head2 ;

        while( pointer1!= null && pointer2!= null ){
            if( pointer1.data!=pointer2.data)  return false ;
            pointer1 = pointer1.next ;
            pointer2= pointer2.next ;
        }
        return true;

    }
    public static  Nodde reverse( Nodde head ){
        if( head == null || head . next == null){
            return head ;
        }
        Nodde newHead  =  reverse( head . next );
        Nodde front = head . next ;
        front . next = head ;
        head . next = null ;

        return newHead ;
    }

    public static  Nodde  findMid(Nodde  head ){
        Nodde fast = head ;
        Nodde slow =  head ;
        fast = fast . next ;
        while(  fast != null &&  fast . next != null ){
            fast = fast .next.next ;
            slow = slow . next ;
        }
        return slow ;
    }
// BRUTE FORCE CODE
public static  boolean isPalindromebruteforce(Nodde head ){
    Stack <Integer> st = new Stack<>();
    Nodde temp = head ;
    while(temp != null ){
        st.push(temp . data );
        temp = temp .next;
    }
    Nodde t = head ;
    while( t != null ){
        if(t . data !=  st.pop()){
            return false ;
        }
        t = t .next ;
    }
    return  true ;
}
    public static void main(String[] args) {
        int arr[]={1,2,3 , 2 ,1 };
        Nodde head = new Nodde(arr[0]);
        head . next = new Nodde(arr[1]);
        head . next . next = new Nodde(arr[2]);
        head . next. next. next= new Nodde(arr[3]);
        head . next.next.next.next= new Nodde(arr[4]);

//        System.out.println(oj.isPalindromebruteforce (head ));
        System.out.println(isPalindromeOptimal(head ));

    }
}
