package leetcode;
public class _81_Search_in_Rotated_Sorted_Array_II {
    public static  boolean found(int []arr, int target){
        int low = 0;
        int high = arr.length-1;
        while(low <= high ){
            int mid = low +(high - low )/2;
            if(arr[mid ]==target){
                return true ;
            }
            if(arr[low]==arr[mid]&& arr[mid]==arr[high]){
                low++;
                high --;
                continue;
            }
            // check which half is sorted .......
            if(arr[low]<= arr[mid]){
                if(arr[low]<=target && target<arr[mid]){
                    high = mid -1 ;
                }
                else{
                    low = mid +1;
                }
            }

            else{
                if(target>arr[mid] && target<=arr[high ]){
                   low=mid+1 ;
                }
                else{
                    high= mid -1 ;
                }
            }
        }
        return  false;
    }
    public static void main(String[] args) {
        int arr[]= {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(found(arr,target));


    }
    }
