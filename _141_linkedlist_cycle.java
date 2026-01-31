package leetcode;

import java.util.HashMap;

class Nood{
    int data ;
    Nood next ;
    Nood(int data ){
        this . data = data;
    }
}
public class _141_linkedlist_cycle{
    //O P T I M AA L   A P P R O C H
    public  static  boolean hasCycleOptimal( Nood head ){
        Nood fast = head ;
        Nood slow = head ;
        while(fast != null && fast . next != null  ){
            fast = fast .next.next ;
            slow = slow . next ;
            if( fast == slow ){
                return  true;
            }
        }
        return  false ;
    }
    //B R U T E    F O R C E
    public static boolean hasCycle(Nood  head) {
        HashMap<Nood , Integer> map = new HashMap<>();
        Nood temp = head ;
        while( temp != null ){
            if( map.containsKey(temp)){
                return true ;
            }
            else map .put( temp , 1 );
        }
         temp = temp . next ;
        return  false ;
    }
    public static void main(String[] args) {
        int arr [] ={3,2,0,-4};
       Nood head = new Nood(arr[0]);
       head . next = new Nood(arr[1]);
       head . next .next = new Nood(arr[2]);
       head .next .next .next = new Nood(arr[ 3 ]);
       head . next .next .next   =head .next ;

        System.out.println(hasCycleOptimal(head ));


    }
}
