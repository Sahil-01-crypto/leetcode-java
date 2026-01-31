package leetcode;

import java.util.Arrays;

public class minimum_number_of_platform_reqquied_in_a_railway {
    public static  int minPlatform( int[] arr , int [] dep ){
        Arrays.sort(arr);
        Arrays.sort(dep);
        int max= 0 ;
        int platform= 0;
        int arrivalPointer = 0, depPointer = 0 ;
        while( arrivalPointer<arr.length && depPointer<dep.length){
            if(arr[arrivalPointer]<=dep[depPointer]){
                arrivalPointer++;
                platform++;
            }
            else if(arr[arrivalPointer]>dep[depPointer]){
                depPointer++;
                platform--;
            }
            max = Math . max(max , platform);
        }
        return  max ;

    }
    public static void main(String[] args) {
        int arr[]={900,945,955,1100,1500,1800};
        int dep[]={920,1200,1130,1150,1900,2000};
        System.out.println(minPlatform(arr , dep ));
    }
}
