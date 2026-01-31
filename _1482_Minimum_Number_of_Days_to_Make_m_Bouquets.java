package leetcode;

 class _1482_Minimum_Number_of_Days_to_Make_m_Bouquets_ {
//    B R U T E      F O R C E      M E T H O D

//public static  int minDays(int[] bloomDay,int k , int m ){
//    int n = bloomDay.length;
//    if(n<k*m) return  -1 ;
//    int min = Integer. MAX_VALUE;
//    int max= Integer. MIN_VALUE;
//    for(int i =0 ; i<bloomDay.length; i ++ ){  // <---loop for calculating the range(a---->b)
//        max= Math.max(max,bloomDay[i]);
//        min = Math.min(min, bloomDay[i]);
//    }
//    for(int i =min;i<= max; i++){
//        int noOfBouquets= calcNumberOfBouquotes(bloomDay,i,k,m);
//        if(noOfBouquets==m){
//            return i;
//        }
//    }
//    return  -1 ;
//}
//public static  int calcNumberOfBouquotes(int arr[], int days , int k , int m ){
//    int count = 0, totalCount=0;
//    for(int i = 0;i<arr.length; i ++){
//        if(arr[i]<=days){
//            count ++;
//        }
//        else{
//            totalCount+=count/k ;
//            count =0;
//        }
//    }
//    totalCount+=count/k;
//    return  totalCount;
//}


//    O P T  I M  A  L      A P P R O C H
//    public static int minDays(int arr [], int m , int k ){
//        if(arr.length<m*k){
//            return -1 ;
//        }
//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;
//        for(int i =0;i <arr.length; i ++){
//            max =Math.max(max, arr[i]);
//            min = Math.min(min,arr[i]);
//        }
//        int low = min;
//        int high = max;
//        int minDays=-1;
//        while(low<= high ){
//            int mid = low +(high - low )/2 ;
//            if(calcDays(arr, mid , m , k)){
//                minDays=mid ;
//                high = mid -1 ;
//            }
//            else{
//                low = mid +1 ;
//            }
//        }
//        return minDays;
//    }
//    public  static  boolean calcDays(int arr[],int hour ,  int m , int k ){
//        int count = 0;
//        int totalCount = 0;
//        for(int i = 0;i<arr.length; i ++){
//            if(arr[i]<=  hour ) {
//                count++;
//                if (count == hour) {
//                    totalCount++;
//                    count =0;
//                }
//            }
//            else{
//                count =0;
//            }
//        }
//
//        return totalCount>=m ;
//    }


    public static  int minDays(int [ ] boolmDays , int m , int k ){
        int  min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        for(int days : boolmDays){
            min = Math.min(min , days);
            max = Math. max(max, days );
        }
        int low = min ;
        int high = max;
        int ans = -1;
        while(low<=high ){
            int mid = low +(high - low )/2 ;
            if(calcDays(boolmDays, mid , m , k )){
                ans= mid ;
                high = mid -1;
            }

            else{
                low = mid +1 ;
            }
        }
        return  ans ;
    }
    public  static  boolean calcDays(int [ ] bloomDays , int days , int m , int k) {
        int count = 0;
        int total = 0;
        for (int i = 0; i < bloomDays.length; i++) {
            if (bloomDays[i] <= days) {
                count++;
            } else {
                total+= count / k;
                count = 0;
            }
        }
        total+= count / k ;
        return total>= m ;
    }
    public static void main(String[] args) {
        int bloomDay[]={7,7,7,7,12,7,7};
       int k =3;
       int m = 2;
        System.out.println(minDays(bloomDay, m , k ));


    }
}
