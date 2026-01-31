package leetcode;

import java.util.HashSet;

class Nodeses {
    int num ;
    Nodeses next ;
    Nodeses(int num ){
        this . num = num ;
    }
}
public class _160_Intersection_of_Two_Linked_Lists {
    // use HASHING
    public static Nodeses intersectionHashSet(Nodeses head1, Nodeses head2) {
        HashSet<Nodeses > set = new HashSet<>();
        Nodeses temp1 = head1;
        while( temp1!= null ){
            set.add(temp1);
            temp1 = temp1.next;
        }
        while(head2!= null ){
            if( set.contains(head2)){
                return head2 ;
            }
            head2= head2.next;
        }
         return null ;
    }






    // extreme BRUTE FORCE

public  static  Nodeses intersection(Nodeses head1 , Nodeses head2){
    while( head2 != null ){
        Nodeses  temp = head1 ;
        while( temp  != null ){
            if( temp == head2 ){
                return head2 ;
            }
             temp = temp . next;
        }
         head2 = head2 . next ;
    }
     return null ;
}

    public static void main(String[] args) {
        Nodeses common = new Nodeses(2);
        common.next = new Nodeses(4);

        // List A: 1 -> 3 -> 1 -> [2 -> 4]
        Nodeses headA = new Nodeses(1);
        headA.next = new Nodeses(3);
        headA.next.next = new Nodeses(1);
        headA.next.next.next = common;

        // List B: 3 -> [2 -> 4]
        Nodeses headB = new Nodeses(3);
        headB.next = common;
//        Nodeses answerNode = intersection(headA , headB);
        Nodeses answerNode = intersectionHashSet(headA, headB);
        if(answerNode!= null ){

            System.out.println(" intersection  point is "+answerNode.num);
        }
        else{
            System.out.println(" no intersection found ");
        }
    }
}
