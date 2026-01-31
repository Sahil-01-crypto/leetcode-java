package leetcode;

import java.util.ArrayList;
import java.util.List;

public class _599_Minimum_Index_Sum_of_Two_Lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        // Brute force comparison
        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) { // Common restaurant found
                    int sum = i + j;

                    if (sum < minSum) {
                        minSum = sum; // Update min sum
                        result.clear(); // Clear previous results
                        result.add(list1[i]); // Add new restaurant
                    } else if (sum == minSum) {
                        result.add(list1[i]); // Add if same index sum
                    }
                }
            }
        }

        return result.toArray(new String[0]); // Convert list to array
    }




    public static void main(String[] args) {
        String list1[]={"Shogun","Tapioca Express","Burger King","KFC"};
        String list2[]={"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
        _599_Minimum_Index_Sum_of_Two_Lists obj = new _599_Minimum_Index_Sum_of_Two_Lists();
        String  arr[]=obj.findRestaurant(list1, list2);
        for(String  value :arr){
            System.out.print(value+" ");
        }
    }
}
