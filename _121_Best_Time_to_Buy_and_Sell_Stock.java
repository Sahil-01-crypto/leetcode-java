package leetcode;

public class _121_Best_Time_to_Buy_and_Sell_Stock {
    public int maxProfit(int[] arr) {
//          BRUTE FORCE METHOD


//        int max_profit=Integer.MIN_VALUE, profit = 0;
//        for(int i =0;i<prices.length;i++){
//            for(int j = i+1;j<prices.length;j++){
//                if(prices[i]<prices[j]){
//                    profit= prices[j]-prices[i];
//                }
//                max_profit= Math.max(max_profit,profit);
//            }
//        }
//        return max_profit;



//        OPTIMAL APPROCH


                int maxPro = 0;
                int minPrice = Integer.MAX_VALUE;
                for (int i = 0; i < arr.length; i++) {
                    minPrice = Math.min(minPrice, arr[i]);
                    maxPro = Math.max(maxPro, arr[i] - minPrice);
                }
                return maxPro;
            }


    public static void main(String[] args) {
        int num []= {7,6,4,3,1};
        _121_Best_Time_to_Buy_and_Sell_Stock obj = new _121_Best_Time_to_Buy_and_Sell_Stock();
        System.out.println(obj.maxProfit(num ));
    }
}
