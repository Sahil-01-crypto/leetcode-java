package leetcode;

import java.util.Stack;

public class _2104_Sum_of_Subarray_Ranges {
    public static long subArrayRangesOptimal(int[] nums) {
        return sumMax(nums) - sumMin(nums);
    }

    public static long sumMax(int arr[]) {
        int[] pgee = findPgee(arr);
        int[] nge = findNge(arr);
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            long left = i - pgee[i];
            long right = nge[i] - i;
            total += (left * right * arr[i]);
        }
        return total;
    }

    public static int[] findPgee(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int pgee[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }
            pgee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return pgee;
    }

    public static int[] findNge(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int nge[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            // FIXED: Use < instead of <= for proper duplicate handling
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) {
                st.pop();
            }
            nge[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nge;
    }

    public static long sumMin(int arr[]) {
        int[] psee = findPsee(arr);
        int[] nse = findNse(arr);
        long total = 0;

        for (int i = 0; i < arr.length; i++) {
            long left = i - psee[i];
            long right = nse[i] - i;
            total += (left * right * arr[i]);
        }
        return total;
    }

    public static int[] findPsee(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int[] psee = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // FIXED: Use >= instead of > for proper duplicate handling
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            psee[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return psee;
    }

    public static int[] findNse(int arr[]) {
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            // FIXED: Use > instead of >= for proper duplicate handling
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }

            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }
        return nse;
    }

    // BRUTE FORCE
    public static long subArrayRanges(int[] nums) {
     long sum = 0 ;
     int n = nums . length;
     for( int i = 0 ; i < n ; i++){
         int  max = nums [i];
         int min = nums [i];
         for( int j = i ; j< n ; j++){
             max = Math .max(max , nums [ j ]);
             min = Math . min( min, nums [ j ]);

             int range = max - min;
             sum+= range ;
         }
     }
      return  sum ;
    }

    public static void main(String[] args) {
        int arr[] = {4, -2, -3, 4, 1};
        System.out.println(subArrayRanges(arr ));
//        System.out.println(subArrayRangesOptimal(arr)); // Expected output: 59
    }
}
