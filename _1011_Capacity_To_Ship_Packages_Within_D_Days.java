package leetcode;

public class _1011_Capacity_To_Ship_Packages_Within_D_Days {
//    BRUTE  FORCE METHOD
//    public int shipWithinDays(int[] weights, int days) {
//        int max = Integer . MIN_VALUE;
//        for(int i = 0;i<weights.length; i ++){
//            max= Math.max(max,weights[i]);
//        }
//        int sum = 0;
//        for(int i = 0;i<weights.length; i ++){
//            sum+=weights[i];
//        }
//        for(int i = max; i <= sum; i ++){
//            int minCapicity=calcMinCapicity(weights,i);
//            if(minCapicity<=days){
//                return i ;
//            }
//        }
//        return -1 ;
//    }
//    public static int calcMinCapicity(int []weights , int  capacity){
//        int  days  = 1 ;
//        int  load  = 0;
//        for(int i = 0;i<weights.length; i ++){
//            if(load+ weights[i] >capacity){
//                days= days +1 ;
//                load  = weights[ i ];
//            }
//            else{
//                load+=weights [ i ];
//            }
//
//        }
//        return days ;
//    }

//     optimal approch

    public static int shipWithinDays(int[] weights, int days) {
        // calculating the maximum of the array
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < weights.length; i++) {
             sum = sum + weights[ i ];
            max = Math.max(max, weights[i]);

        }
        int low = max;
        int high = sum ;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int noOfDays = calcDays(weights, mid);
            if (noOfDays <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int calcDays(int[] weights, int capacity) {
        int days = 1;
        int load = 0;
        for (int i = 0; i < weights.length; i++) {
            if (load + weights[i] > capacity) {
                days += 1;
                load = weights[i];
            } else {
                load += weights[i];
            }
        }
        return days;
    }


    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,6,7,8,9,10};
        int days = 5 ;
        _1011_Capacity_To_Ship_Packages_Within_D_Days obj=  new _1011_Capacity_To_Ship_Packages_Within_D_Days();
        System.out.println(" minimum capicity will be "+obj.shipWithinDays(arr, days));

    }
}
