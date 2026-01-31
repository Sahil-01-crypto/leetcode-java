package leetcode;

import java.util.ArrayList;

public class MERGE_SORT {
 public static  void mergesort( int arr[], int low , int  high ) {
     if(low >= high ) return ;
     int mid = (low +high)/ 2 ;
     mergesort(arr , low , mid );
     mergesort(arr , mid +1 , high );
     merge(arr , low , mid , high );
 }
 public  static  void merge(int arr [ ] , int low , int mid , int high ){
     int left = low ;
     int right = mid +1 ;
     ArrayList<Integer> list = new ArrayList<>();
     while( left<= mid && right <= high ){
         if( arr [ left ]<= arr[ right ]){
             list . add(arr[left++]);
         }
         else{
             list . add(arr[right++]);
         }
     }
     while( left <= mid ) list.add(arr[left++]);
     while( right <= high ) list.add(arr[right++]);

     for( int i = 0;i< list . size() ; i++ ){
         arr[low+i ]= list . get(i);
     }
 }

    public static void main(String[] args) {
        int arr [] = { 9,8,7,6,5,4,3,2,1};

       mergesort(arr , 0 , arr.length-1 );
        for( int i = 0 ; i < arr.length ; i ++){
            System.out.print(arr[ i ]+ " ");
        }
        System.out.println();
        }

    }


