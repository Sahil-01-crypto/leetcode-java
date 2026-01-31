package leetcode;

public class _206_reverse_linled_list {
    public static  class Nodeee {
        int data;
        Nodeee next;

        Nodeee(int data) {
            this.data = data;
        }
    }


    // RECURSIVE APPROCH
    public static  Nodeee reverseRecursive(Nodeee head ) {
        if( head ==null || head . next == null ){
            return head ;
        }
        Nodeee newNode = reverseRecursive(head . next);
        Nodeee front = head . next;
        front . next = head ;
        head . next = null ;

        return newNode;
    }
    public  static  void display( Nodeee head ){
        while( head != null ){
            System.out.print(head.data+" ");
            head = head . next ;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Nodeee head = new Nodeee(arr[0]);
        head.next = new Nodeee(arr[1]);
        head.next.next = new Nodeee(arr[2]);
        head.next.next.next = new Nodeee(arr[3]);
        head.next.next.next.next = new Nodeee(arr[4]);
        head  = reverseRecursive(head );
        display(head );
        System.out.println( head . data);
    }
}