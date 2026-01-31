package leetcode;
class NOOOd {
    int data ;
    NOOOd next;
    NOOOd(int data ){
        this . data = data;
    }
}
public class _25_Reverse_Nodes_in_k_Group {
    public static NOOOd reverseKGroup(NOOOd head , int k ){
        NOOOd temp = head ;
        NOOOd prevNoad = null ;
        while( temp != null){
            NOOOd KthNode = findKth(temp , k);
            if( KthNode == null ){
                if( prevNoad!= null ){
                    prevNoad.next= temp ;
                }
                break ;
            }
            NOOOd newNoad = KthNode . next;
            KthNode .next = null ;
            reverse(temp );
            if( temp== head ){
                head = KthNode;
            }
            else{
                prevNoad.next = KthNode;
            }
            prevNoad = temp ;
            temp = newNoad;
        }
        return  head ;

    }
     public static NOOOd reverse(NOOOd head){
        NOOOd temp = head ;
        NOOOd prev = null;
        while( temp != null){
            NOOOd front= temp .next;
            temp .next = prev ;
            prev = temp ;
            temp = front ;
        }
         return prev ;
     }
    public static NOOOd findKth(NOOOd head , int k){
         k=k-1;
         NOOOd temp = head ;
         while( k >0 ){
             temp = temp .next;
             k--;
         }
          return temp;
    }
    public static  void display( NOOOd head ){
        NOOOd temp = head ;
        while( temp != null ){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5};
        NOOOd head = new NOOOd(arr[0]);
        NOOOd curr = head ;
        for(int i = 1 ; i<arr.length;i++){
            curr.next=new NOOOd(arr[i]);
            curr= curr.next;
        }
        head = reverseKGroup( head , 2);
        display( head );

    }
}
