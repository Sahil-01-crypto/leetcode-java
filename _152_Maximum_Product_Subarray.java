package leetcode;

public class _152_Maximum_Product_Subarray {
    public int maxProduct(int[] nums) {
        int max_product = Integer.MIN_VALUE;
        for(int i = 0;i<nums.length;i++){
            int  product =1;
            for(int j = i ; j<nums .length; j++){
                product*=nums[j];
                max_product= Math.max(max_product,product);
            }
        }
        return  max_product;
//        int product = 1;
//        for(int i = 0;i<nums.length; i++){
//            product*=nums[i];
//
//            if(product>max_product){
//                max_product= product;
//
//            }
//            if(product<0){
//                product=1;
//            }
//        }
//        return max_product;

    }
    public static void main(String[] args) {
        int  [] arr = {-3,-1,-1};
        _152_Maximum_Product_Subarray obj = new _152_Maximum_Product_Subarray();
        System.out.println(obj.maxProduct(arr));
    }
}
