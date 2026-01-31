package leetcode;

public class _875_Koko_Eating_Bananas {

    //        BRUTE        FORCE
//    public static  int findMax(int arr[]){
//        int max= Integer.MIN_VALUE;
//        for(int i = 0 ;i<arr.length; i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        return  max;
//    }
//    public static  int calcTotal(int arr[], int i ){
//        int total=0;
//        for(int j = 0;j<arr.length ; j ++){
//            total+=Math.ceil((double)(arr[j])/(double) (i));
//        }
//        return total;
//    }
//    public  int minEatingSpeed(int []piles , int hour ){
//        int max= findMax(piles);
//        for(int i = 1 ; i<= max; i ++){
//           int  finaalTotal= calcTotal(piles,i);
//           if(finaalTotal<=hour){
//               return i;
//           }
//        }
//        return -1;
//    }


//      o p t i m a l    a p p r o c h
 public int minEatingSpeed(int arr[], int deadline) {  // 🔧 FIXED: corrected parameter name casing
     int low = 1;
     int high = findMax(arr);  // 🔧 FIXED: removed typo '=>'
 
     int ans = -1;
 
     // Applying binary Search
     while (low <= high) {
        int mid = low + (high - low) / 2;  // 🔧 FIXED: cleaner mid calculation
 
         int numberHour = calcHour(arr, mid);  // 🔧 FIXED: fixed spacing and naming
         if (numberHour <= deadline) {
             ans = mid;
             high = mid - 1;
         } else {
             low = mid + 1;
         }
     }
 
     return ans;
}
 
 public static int findMax(int arr[]) {
     int max = Integer.MIN_VALUE;
     for (int i = 0; i < arr.length; i++) {  // 🔧 FIXED: changed 'j' to 'i'
        max = Math.max(max, arr[i]);
     }
     return max;
 }
 
 public static int calcHour(int arr[], int hourly) {
     int total = 0;
     for (int i = 0; i < arr.length; i++) {  // 🔧 FIXED: changed 'j' to 'i'f
        total += (int ) Math.ceil((double) arr[i] / (double) hourly);  // 🔧 FIXED: changed '=' to '+=' and cast to int
     }
     return total;
 }
    public static void main(String[] ar) {
        int piles []= {3,6,7,11};
        int hour = 8 ;
        _875_Koko_Eating_Bananas obj = new _875_Koko_Eating_Bananas();
        int ans = obj.minEatingSpeed(piles , hour);
        System.out.println("Koko should eat at least " + ans + " bananas per hr");
    }

}
