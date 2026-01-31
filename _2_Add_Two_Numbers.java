package leetcode;

import org.xml.sax.ext.Locator2;

class Nod{
    int data ;
    Nod next ;
    Nod(int data ){
        this . data = data ;
    }
}
public class _2_Add_Two_Numbers {
    public static Nod  addTwoNumbers(Nod  list1, Nod  list2) {
        Nod dummy = new Nod(-1 );
        Nod temp = dummy ;

        Nod t1 = list1, t2 = list2;
        int carry = 0;
        while(t1 != null || t2 != null ){
            int sum = carry ;
            if( t1 != null ) sum += t1.data ;
            if( t2 != null ) sum+= t2 . data ;
            Nod newNode = new Nod(sum% 10  );
            carry = sum / 10 ;
            temp . next = newNode ;
            temp  = temp . next ;

            if( t1 != null ) t1 = t1 . next ;
            if( t2 != null ) t2 = t2 .next;
        }
        if( carry != 0 ){
            Nod newNode = new Nod(carry );
            temp .  next = newNode ;

        }
         return  dummy .next ;
    }
    public static  void display(Nod heads ){

    Nod head = heads ;
        while(head!= null ){
            System.out.print(head .data+" ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        int arr[] = {9,4,6};
        Nod head = new Nod(arr[0]);
        head.next = new Nod(arr[1]);
        head.next.next = new Nod(arr[2]);
//        head.next.next.next = new Nod(arr[3]);
//        head.next.next.next.next = new Nod(arr[4]);
        int arr2 [] ={3,8,6};
        Nod head2 = new Nod(arr2[0]);
        head2.next = new Nod(arr2[1]);
        head2.next.next = new Nod(arr2[2]);

        Nod answerNode =  addTwoNumbers(head , head2);
        display(answerNode);
    }
}
