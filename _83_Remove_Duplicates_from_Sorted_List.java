package leetcode;
class Noad {
    int data ;
    NOOOd next ;
    Noad(int data){
         this . data = data ;
    }
}
public class _83_Remove_Duplicates_from_Sorted_List {
    public static NOOOd removeDuplicate(NOOOd head ){
        NOOOd temp = head ;
        while( temp != null ){
            NOOOd newNode= temp .next;
            while( newNode != null && temp.data ==newNode . data ){
                newNode = newNode.next;
            }
             temp.next = newNode;
             temp = temp .next;
        }
         return head ;
    }
    public static  void display( NOOOd head ){
        NOOOd temp = head;
        while (temp != null) {
            System.out.print(temp .data+" ");
            temp= temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {1,1,2,3,4,4,5};

        NOOOd head = new NOOOd(arr[0]);
        NOOOd charr = head ;
        for( int i = 1 ; i<arr.length ; i ++){
            charr.next =  new NOOOd(arr[i]);
            charr = charr . next;
        }
        head = removeDuplicate(head);
        display( head );

    }
}
