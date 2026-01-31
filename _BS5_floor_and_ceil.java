package leetcode;

public class _BS5_floor_and_ceil {
    public static int findFloor(int []arr, int x){
        int low = 0;
        int high = arr.length-1;
        int element = -1;
        while(low<= high ){
            int mid = low +(high - low )/2 ;

            if(arr[mid]<=x){
                element= arr[mid];
                low= mid +1 ;
            }
            else{
                high = mid -1;
            }
        }
        return element ;
    }

    public static int findCeling(int []arr , int x ){
        int n = arr.length;
        int low = 0;
        int high = n-1 ;
        int element = -1 ;
        while(low<= high ){
            int mid = low +(high - low )/2 ;

            if(arr[mid]>= x ){
                element = arr[mid ];
                high = mid -1;
            }
            else {
                low = mid +1;
            }
        }
        return  element;
    }
    public static void main(String[] args) {
        int nums  []={3,4,4,7,8,10};
        int x = 5;
        int floor=findFloor(nums,x);
        int celing = findCeling(nums , x );
        System.out.println("floor is "+floor);
        System.out.println("celing is "+celing);

    }
}
