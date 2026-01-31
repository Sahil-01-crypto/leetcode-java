//package leetcode;
//class NOAD {
//    int data;
//    NOAD next;
//
//    NOAD(int data) {
//        this.data = data;
//    }
//}
//    //}
//
//
//
//    //
////        // one traversal approch
////    public Node calcNode2(Node head , int node ){
////            Node fast = head ;
////            Node slow = head ;
////            for(int i = 0 ;i<= node ; i ++){
////                fast= fast.next;
////            }
////            while(fast!= null ){
////                slow = slow .next;
////                fast = fast .next;
////            }
////            return slow ;
////    }
////
////    }
////
//    public class ll_nth_node_frpom_the_end_of_linked_lsit {
//        public static  NOAD calcNode(NOAD head, int node) {
//            NOAD temp = head ;
//            int len= 0;
//            while(temp != null){
//                temp = temp .next;
//                len ++;
//            }
//            int m = len - node ;
//            NOAD temp2 = head ;
//            while(m>0){
//                m--;
//                temp2 = temp2 .next;
//            }
//            if (temp2 == null) return null;
//
//
//            return temp2;
//
//        }
//
//        public static void main(String[] args) {
//            NOAD a = new NOAD(100);
//            NOAD b = new NOAD(13);
//            NOAD c = new NOAD(4);
//            NOAD d = new NOAD(5);
//            NOAD e = new NOAD(12);
//            NOAD f = new NOAD(10);
//            a.next = b;
//            b.next = c;
//            c.next = d;
//            d.next = e;
//            e.next = f;
//
//            NOAD ans = calcNode(a, 3);
//            System.out.println(ans.data);
//        }
//    }
//
//
