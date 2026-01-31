package leetcode;

import java.util.HashMap;
import java.util.Map;

class Nodelists {
    int daata ;
    Nodelists next  ;
    Nodelists(int daata){
        this . daata = daata ;
    }
}

public class _length_of_a_linked_list_cycle {
    //optimal code
    public static int cycleLengthOptimal(Nodelists head) {
        Nodelists fast = head;
        Nodelists slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                // Cycle detected, now count the length
                int count = 1;
                Nodelists temp = slow.next;
                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }
                return count;
            }
        }

        return 0; // No cycle
    }

    // brute force
    public  static  int cycleLength( Nodelists head ){
        Map<Nodelists  , Integer > map = new HashMap<>();
        int timeer = 0 ;
        Nodelists  temp = head ;
        while( temp != null ){
            if( map.containsKey(temp)){
                int ans = timeer - map .get(temp  ) ;
                return  ans ;
            }
            if( ! map .containsKey(temp)){
                map . put(temp ,timeer +=1 );
            }

            temp = temp.next;
        }
        return 0 ;
    }
    public static void main(String[] args) {
        int arr [] ={3,2,0,-4};
        Nodelists head = new Nodelists(arr[0]);
        head . next = new Nodelists(arr[1]);
        head . next .next = new Nodelists(arr[2]);
        head .next .next .next = new Nodelists(arr[ 3 ]);
        head . next .next .next   =head .next ;
//        System.out.println(cycleLength(head ));
        System.out.println(cycleLengthOptimal(head ));
    }
}
