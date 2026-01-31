package leetcode;

//import LINKED_LIST._searching_in_linked_list;

class Nods {
    int val  ;
    Nods next ;
    Nods(int val ){
         this . val = val;
    }
}
public class _148_sort_lists {
    public  static  Nods sortLl( Nods head ) {
        if( head == null || head .next == null ){
            return head  ;
        }
        Nods middle = findMiddle(head );
        Nods right  = middle .next;
        middle . next = null ;
        Nods left = head ;

        left = sortLl(left);
        right = sortLl(right );
        return merge(left , right );
    }
    public static  Nods merge( Nods list1  , Nods list2){
        Nods dummy = new Nods(-1 );
        Nods temp = dummy ;
        Nods left = list1;
        Nods right = list2 ;
        while( left != null && right != null ){
             if( left .val <= right . val ){
                 temp . next = left ;
                 left = left . next ;
             }
             else {
                 temp .next = right;
                 right = right . next;
             }

             temp  = temp .next ;
         }
        if( left != null ) temp . next = left ;
        if( right != null ) temp . next =  right ;

        return dummy .next ;
    }
    public  static  Nods  findMiddle( Nods head ){
        Nods fast = head ;
        Nods slow = head ;
        fast = fast .next ;
        while( fast != null && fast .next != null ){
            fast = fast .next.next;
            slow = slow .next ;
        }
        return  slow ;
    }


    public static  void display(Nods head ){
        Nods temp = head;
        while( temp != null ){
            System.out.print(temp .val+" ");
            temp = temp . next;
        }
    }

    public static void main(String[] args) {
         int arr [ ]={3 ,2 ,5 ,4 ,1};
      Nods head = new Nods(arr[0]);
      Nods current = head ;
      for( int i = 1;i< arr.length ; i++){
          current . next = new Nods(arr[i]);
          current = current .next;
      }
        head  = sortLl(head );
        display(head );

    }
}
