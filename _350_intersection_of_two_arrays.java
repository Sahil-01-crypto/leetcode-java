package leetcode;
import java.util.ArrayList;
import java . util . Arrays ;
public class _350_intersection_of_two_arrays {
    public int[] intersect(int[] nums1, int[] nums2) {
     ArrayList <Integer>h1 = new ArrayList<>();
     Arrays.sort(nums1);
     Arrays.sort(nums2);

     int  i = 0, j = 0;
     while(i<nums1.length && j<nums2.length){
         if(nums1[i]<nums2[j]){
             i++;
         }
         else if (nums1[i]>nums2[j]){
             j++;
         }
         else{
             h1.add(nums1[i]);
             i++;
             j++;
         }
     }
     int arr[]=new int [h1.size()];
     for(int k = 0;k< h1.size();k++){
         arr[k]=h1.get(k);
     }
     return arr;

    }
    public static void main(String[] args) {
        int nums1[] ={1,2,2,3,4,4,5,6};
        int nums2 []={2,2,5,6};
        _350_intersection_of_two_arrays obj = new _350_intersection_of_two_arrays();
        int arr[]=obj.intersect(nums1, nums2);
        for(int nums:arr){
            System.out.print(nums+" ");
        }
    }
}
