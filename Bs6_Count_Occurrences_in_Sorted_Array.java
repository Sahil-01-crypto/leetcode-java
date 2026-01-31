package leetcode;

public class Bs6_Count_Occurrences_in_Sorted_Array {
    public static int  occurence(int arr [], int target ){
        int first=findOccurence(arr ,target , true  );
        int last = findOccurence(arr, target , false);
        if(first ==-1){
            return 0 ;
        }
        else{
            return (last - first )+1;
        }

    }
    public static  int findOccurence(int []arr, int target , boolean flag   ){
        int n = arr.length;
        int low = 0 ;
        int high = arr.length-1;
        int index = -1;
        while(low<= high ){
            int mid = low +(high - low )/2 ;
            if(arr[mid ]== target ) {
                index = mid;
                if (flag)
                    high = mid - 1;
                else
                    low = mid +1 ;
            }
            else if(arr[mid]>target){
                high = mid -1 ;
            }
            else {
                low = mid +1 ;
            }
        }
        return index ;
    }
    public static void main(String[] args) {
        int []arr={2,2,3,3,3,4};
        int x= 3 ;
        System.out.println("the element  occured "+occurence(arr, x )+"times");

    }
}
