package leetcode;

class NoDe {
    int data;
    node next  = null ;
    NoDe(int data ){
        this . data = data ;
    }
}
class LinkedListt {
    public static node findMiddle(node head ){
        node fast = head ;
        node slow = head ;
        fast = fast . next ;
        while( fast != null && fast .next != null){
            fast = fast . next . next ;
            slow = slow . next ;
        }
         return slow ;
    }
    public static node sort(node head) {
        if( head == null || head . next == null ){
            return head  ;
        }
        node middle = findMiddle( head );
        node middnext = middle .next ;
        middle . next = null ;
        node left = sort(head );
        node right = sort(middnext);

        return  merge(left , right );
    }
    public static node merge(node head1 , node head2 ){
        node dummy = new node( -1 );
        node temp =  dummy;

        node t1 = head1 ;
        node t2 = head2 ;
        while( t1 != null && t2 != null ){
            if( t1 . data <= t2 . data){
                 temp . next = t1 ;
                 t1 = t1 . next ;
            }
            else{
                temp . next = t2 ;
                t2 = t2 .next ;
            }
            temp = temp . next ;
        }
        if( t1 != null ){
            temp . next = t1 ;
        }
        if( t2 != null ){
            temp . next = t2 ;
        }
         return  dummy . next ;
    }
    public  static  void display(node head ){
        node temp = head ;
        while(temp != null ){
            System.out.print(temp.data+" ");
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,8,5,4,6};
        node head = new node(arr[0]);
        head . next = new node(arr[1]);
        head . next . next = new node(arr[2]);
        head . next. next. next= new node(arr[3]);
        head . next.next.next.next= new node(arr[4]);
        head =sort(head);
        display(head );
    }
}


