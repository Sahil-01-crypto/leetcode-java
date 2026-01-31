package leetcode;

import java.util.Arrays;

public class _Shortest_Job_First_or_SJF_CPu_Scheduling {
    public static  int jobScheduling(int[]arr ){
       Arrays.sort(arr);
       int waitingTime=0;
       int currentZTime = 0;
       for( int i = 0;i<arr.length-1 ; i++){
           currentZTime+= arr[i];
           waitingTime+= currentZTime ;
       }
        return  waitingTime/arr.length;
    }
    public static void main(String[] args) {
        int arr [] = {3, 1, 4, 2, 5};
        System.out.println(jobScheduling(arr));
    }
}
