package leetcode;

import java.util.List;
import java.util.Stack;

class ListNodeee{
    int val ;
    ListNodeee next ;

    ListNodeee(int val  ){
        this . val = val ;

    }
}
public class _1019_Next_Greater_Node_In_Linked_List {
    public static int[] nextLargerNodes(ListNodeee head) {
        int size = 0 ;
        ListNodeee temp = head ;
        ListNodeee prev  = null ;
        while( temp != null){
            ListNodeee front =  temp . next ;
            temp . next = prev ;
            prev = temp ;
            temp = front ;
            size++;
        }
        ListNodeee curr = prev ;
        int index = size -1 ;
        int ans[] = new int[size ];
        Stack<Integer> st = new Stack<>();
        while(  curr != null){
            while(!st.isEmpty() && st . peek()<= curr . val) {
                st.pop();
            }
            ans[index--] = st.isEmpty()? 0 : st .peek();
            st.push(curr .val);
            curr  = curr . next;
        }
        return ans ;


    }
    public static void main(String[] args) {
        ListNodeee head = new ListNodeee(2);
        head . next = new ListNodeee(5) ;
        head.next . next = new ListNodeee(10);

        int ans[] = nextLargerNodes( head);
        for( int x: ans){
            System.out.print(x+" ");
        }
    }
}
