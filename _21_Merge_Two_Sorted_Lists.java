package leetcode;

import java.util.ArrayList;

class Nodes{
    int   val ;
    Nodes next ;
     Nodes(int val ){
         this . val = val ;
     }
}
class Mergelist {
    public Nodes mergeTwoLists(Nodes list1, Nodes list2) {
        Nodes dummy = new Nodes(-1);
        Nodes temp = dummy;
        Nodes  head1  = list1 ;
        Nodes  head2 = list2;
        while( head1 != null && head2 != null ){
            if( head1.val <= head2.val) {
                temp.next = head1;
                head1  = head1 .next;
            }
            else if ( head2.val < head1.val){
                temp . next= head2 ;
                head2 = head2 .next;
            }
            temp = temp . next ;
        }
        while( head1 != null ){
            temp .next= head1 ;
            head1= head1.next;
            temp = temp.next;
        }
        while( head2 != null ){
            temp .next = head2 ;
            head2 = head2 . next ;
            temp = temp.next ;
        }
        return  dummy .next ;
    }
}
public class _21_Merge_Two_Sorted_Lists {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,55 };
        int arr2[] = {6,7,8,9};
        Nodes head1 = new Nodes(arr1[0]);
        Nodes current = head1;
        for (int i = 1; i < arr1.length; i++) {
            current.next = new Nodes(arr1[i]);
            current = current.next;
        }
        Nodes head2 = new Nodes(arr2[0]);
        Nodes curent1 = head2;
        for (int i = 1; i < arr2.length; i++) {
            curent1.next = new Nodes(arr2[i]);
            curent1 = curent1.next;
        }
        Mergelist obj = new Mergelist();
        Nodes head = obj.mergeTwoLists(head1, head2);
        display(head);


    }

    public static void display(Nodes head) {
        Nodes temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
}