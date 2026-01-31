package leetcode;

 class _35_BS3_search_insert_position {
    public  static  int search(int nums [],int target ){
        int n = nums .length;
        int low = 0 ;
        int high = n-1 ;
        int index = n ;
        while(low<= high ) {
            int mid = low + (high - low) / 2;

            if(nums [ mid  ]>=target){
                index= mid;
                high = mid -1 ;
            }
            else {
                low = mid +1 ;
            }
        }
        return  index;

    }
    public static void main(String[] args) {
        int arr[]={1,2,4,7};
        int target =9;
        int ans = search(arr , target );
        System.out.println(ans);
    }
}
