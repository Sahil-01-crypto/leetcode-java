package leetcode;
class Nodelist {
    int data ;
    Nodelists next ;
    Nodelist(int data ){
        this . data = data ;
    }

}

public class _142_Linked_List_Cycle_II {
    public static Nodelists cyclePosition(Nodelists head  ){
        Nodelists fast = head ;
        Nodelists slow = head;

        while(fast != null && fast.next!=null){
            fast = fast . next . next ;
            slow = slow . next ;

            if( fast == slow ) {
                slow = head ;
                while( slow != fast ){
                    slow = slow . next ;
                    fast = fast .next ;
                }
                return  slow ;
            }
            }
        return null ;
    }
    public static void main(String[] args) {
        int arr [] ={3,2,0,-4};
        Nodelists head = new Nodelists(arr[0]);
        head . next = new Nodelists(arr[1]);
        head . next .next = new Nodelists(arr[2]);
        head .next .next .next = new Nodelists(arr[ 3 ]);
        head . next .next .next   =head .next ;
        System.out.println(cyclePosition(head));
    }
}
