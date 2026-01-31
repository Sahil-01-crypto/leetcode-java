//package leetcode;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java . util . List;
//class Nodess {
//        int data ;
//    NoDe next  ;
//    NoDe prev ;
//    Nodess(int data ){
//        this .  data = data ;
//
//    }
//        }
//public class Find_pairs_of_given_sum_in_dorted_DLL {
//
//
//    // OPTIMAL APPROCH
//
//
//    public  static  List<List<Integer>> findpairsOptimal(NoDe head  , int target){
//        List<List<Integer>> pair  = new ArrayList<>();
//        NoDe left = head;
//        NoDe right = head ;
//        while(right . next != null ){
//             right = right . next;
//        }
//        while (left.data < right.data) {
//            if (left.data + right.data == target) {
//                pair.add(Arrays.asList(left.data ,  right .data));
//                left = left . next;
//                right = right . prev;
//            }
//            else if( right . data + left . data> target ){
//                right = right . prev ;
//            }
//            else{
//                left =  left . next;
//            }
//        }
//         return  pair;
//
//    }
//
//
//    // BRUTE  FORCE METHOD
//
//
//    public static List<List<Integer>> findPairsWithSum(NoDe head, int target){
//        List<List<Integer>> pair = new ArrayList<>();
//        NoDe temp = head ;
//        while( temp != null ){
//            NoDe temp2 = temp . next ;
//            while( temp2 != null && temp.data+ temp2.data <= target ){
//                if( temp.data + temp2.data== target){
//                    pair . add(Arrays.asList(temp.data , temp2.data));
//                }
//                temp2 = temp2 .next;
//            }
//            temp = temp . next;
//        }
//        return  pair;
//
//    }
//    public static void main(String[] args) {
//        NoDe a = new NoDe(1);
//        NoDe b = new NoDe(2);
//        NoDe c = new NoDe(3);
//        NoDe d = new NoDe(4);
//        NoDe e = new NoDe(9);
////        Lnodess f = new Lnodess(6);
//        a.next = b ;
//        b.prev = a ;
//        b.next = c ;
//        c.prev = b ;
//        c.next= d ;
//        d.prev = c ;
//        d.next=e;
//        e.prev=d;
////        e.next = f;
//        List<List<Integer>> result = findpairsOptimal(a , 5 );
//        for( List<Integer> ans :result){
//            System.out.println(ans.get(0)+" , "+ans.get(1));
//        }
//
//    }
//}
