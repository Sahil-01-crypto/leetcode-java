package leetcode;

import java.util.List;

class NodeList {
    int val;
    NodeList next;

    NodeList(int val) {
        this.val = val;

    }
}


    public class _876_Middle_of_the_Linked_List {

    // BRUTE FORCE

     public static NodeList  middleNodebruteforce( NodeList  head){
         int count = 0 ;
         NodeList temp = head ;
         while( temp != null ){
             count ++ ;
             temp = temp . next ;
         }
         int mid = (count +1 )/2 ;
           NodeList   t  = head ;
         for( int i = 1   ; i < mid ; i++){
               t = t . next ;
         }
         head = t ;
         return  head ;

     }

     //OPTIMAL SOLUTION


        public static NodeList middleNodeoptimal (NodeList head) {
            NodeList fast = head;
            NodeList slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow ;
        }
        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,8 };
            NodeList head = new NodeList(arr[0]);
            head.next = new NodeList(arr[1]);
            head.next.next = new NodeList(arr[2]);
            head.next.next.next = new NodeList(arr[3]);
            head.next.next.next.next = new NodeList(arr[4]);
            head . next . next .next .next . next = new NodeList(arr[5]);
//            head = middleNodeoptimal ( head );
            head = middleNodeoptimal( head );
            System.out.println(head.val);

        }
    }

