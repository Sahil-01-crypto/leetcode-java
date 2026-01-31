package leetcode;
class NODE {
    int data ;
    NODE next ;
    NODE(int data ){
        this .data=data;
    }

}
public class _61_rotate_linkedLIst {
    public static NODE rotatell(NODE head , int k ){
        // step 1 -> calculate the length
        //step 2 -> connect the tail node with the head
        // step 3 -> fun a loop till (k%length ) times
        //step 4 -> make new head to next node where step 3 loop terminaate
        // step 5 -> break the link
        int length = 1 ;
        NODE temp = head ;
        while( temp .next != null ){
            temp = temp .next ;
            length++;
        }

        k= k % length ;
        if( k % length== 0 ) return head ;
        temp . next = head ;
        int rem = length - k ;
        NODE  pointer = head ;
        for( int i = 1 ;i<=rem -1 ;i++){
            pointer = pointer.next;
        }
        NODE newHead = pointer .next ;
        pointer.next = null ;
        return  newHead;
    }
    public  static  void  display(NODE head ){
        NODE temp= head;
        while( temp != null ){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        NODE head = new NODE(arr[0]);
        NODE temp = head;
        for(int i = 1 ; i <arr.length ;i++){
            temp.next = new NODE(arr[i]);
            temp = temp .next;
        }
        head = rotatell(head , 5 );
        display( head );
    }
}
