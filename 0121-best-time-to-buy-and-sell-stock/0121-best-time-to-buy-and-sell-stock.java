class Solution {
    public int maxProfit(int[] prices) {
       int minPrice=prices[0];
       int maxPrice=0;
       for(int i=1;i<prices.length;i++)
       {
        minPrice=Math.min(minPrice,prices[i]);
        int profit=prices[i]-minPrice;
        maxPrice=Math.max(maxPrice,profit);
       }
       return maxPrice;
    }
}
/*We find the minimum price to buy the stock,find current profit by substracting buying price from selling price and keep maximising the profit unless we get the max, return the max profit */