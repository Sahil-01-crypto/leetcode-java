package leetcode;
class Noods{
    int data ;
    Noods next ;
    Noods( int data ){
        this . data = data ;
    }
}
public class _82_Remove_Duplicates_from_Sorted_List_II {
    public  static  Noods removeduplicate( Noods head ){
        Noods dummy = new Noods(-1);
        Noods   temp = dummy ;
        Noods curr = head ;
        while( curr != null ){
            if( curr .next != null && curr .data == curr.next.data){
                while( curr .next!= null && curr.data==curr.next.data){
                    curr = curr . next ;
                }

                    temp . next = curr . next;


            }
            else{
                temp . next = curr ;
                temp = temp . next;

            }
            curr = curr.next;

        }
        return dummy .next;
    }
    public static  void display( Noods head ){
         Noods  temp = head;
         while( temp != null ){
             System.out.print( temp . data + " ");
              temp = temp . next ;
         }
    }
    public static void main(String[] args) {
        int arr[]= {1,1,1,2,3,4,4,4,5};
        Noods head= new Noods(arr[0]);
        Noods curr = head;
        for( int i= 1 ; i < arr.length ; i ++){
            curr.next = new Noods(arr[i]);
            curr = curr .next;
        }
        head = removeduplicate(head );
        display( head );

    }
}
