class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        int min = prices[0];

        int i = 1;
        while(i < n){
            
            if(prices[i]<min){
                min = prices[i];
            }else{
                profit = Math.max(profit, prices[i] - min);
            }
            i++;
        }

        return profit;
    }
}