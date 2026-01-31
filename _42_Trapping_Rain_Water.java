package leetcode;

public class _42_Trapping_Rain_Water {
    //  O P T I M A L    S O L
    public int trapp( int [ ] height ) {
       int leftMax = 0;
       int rightMax = 0;
       int left = 0;
       int right = height.length-1 ;
       int watrer= 0 ;
       while( left<right){
           if(height[left]<= height[right]){
               if( leftMax>height[left]){
                   watrer+= leftMax- height[left];
               }
               else{
                   leftMax=  height[ left];
               }
               left++;
           }
           else{
               if(rightMax>height[right]){
                   watrer+=rightMax-height[right];
               }
               else{
                   rightMax= height[right];
               }
               right--;
           }
       }
       return watrer;
    }
    public int trap(int[] height) {
        int []prefixMax =new int [ height . length];
        int []suffixMax  =new int [ height . length];
        prefixMax[0] = height[0];
        for( int i = 1 ; i<height.length ;i++){
            prefixMax[i]= Math.max(prefixMax[i-1], height[i]);
        }
        suffixMax[height.length-1 ]=height[height.length -1 ];
        for( int i = height.length-2 ; i>=0; i--){
            suffixMax[i]= Math . max(height[i],suffixMax[i+1]);
        }
        int waterTrap = 0 ;
        for(int i = 0 ;i<height . length ; i++){
            int leftMax = prefixMax[i];
            int rightMax = suffixMax[i];
            waterTrap += Math.min(leftMax, rightMax) - height[i];
        }
        return  waterTrap;
    }
    public static void main(String[] args) {
        int [ ] arr = {4,2,0,3,2,5};
        _42_Trapping_Rain_Water obj = new _42_Trapping_Rain_Water();
        System.out.println(obj .trapp(arr));

    }
}
