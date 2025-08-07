class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int price : prices) {
            // Update minPrice if current price is lower
            if (price < minPrice) {
                minPrice = price;
            } 
            // Otherwise, calculate profit and update maxProfit if needed
            else {
                int profit = price - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        
        return maxProfit;
    }
}
