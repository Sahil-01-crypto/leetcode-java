package leetcode;

import com.sun.jdi.connect.Connector;

public class _BS_10_Minimum_in_Rotated_Sorted_Array {
    public static  int rotared(int arr []){
       int low = 0;
       int high = arr.length-1;
       int ans = Integer.MAX_VALUE;
       int index = -1 ;
       while(low<= high ){
           int mid = low +(high - low )/2 ;

           if(arr[low ]<arr[high ]){
               if(arr[low]<ans ){
                   ans = arr[low] ;
                   index= mid;

               }
               break;

           }
           if(arr[low]<= arr[mid ]){
               if(arr[low]<ans ){
                   ans = arr[low  ];
                   index= low ;
               }
               low = mid +1;
           }

            if(arr[mid ]<= arr[high ]){
                if(arr[mid ]<ans ){
                    ans = arr[mid ];
                    index= mid;
                }
                high = mid -1;
            }
       }
       return index;
    }
    public static void main(String[] args) {
        int arr[]= {9,1,2,3,4,5,6,7,8};
        System.out.println("number of times the array has been rotated "+rotared(arr));
    }
}
