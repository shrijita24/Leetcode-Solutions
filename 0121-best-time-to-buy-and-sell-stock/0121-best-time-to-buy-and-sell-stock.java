class Solution {
    public int maxProfit(int[] prices) {
       int minPrice=prices[0];//minimum price for buying
       int maxProfit=0; 
       for(int i=1;i<prices.length;i++)
       {
        minPrice=Math.min(prices[i],minPrice);
        int profit=prices[i]-minPrice;//profit if sold today
        maxProfit=Math.max(profit,maxProfit);
       }
       return maxProfit;
    }
}
/*We find the minimum price to buy the stock,find current profit by substracting buying price from selling price and keep maximising the profit unless we get the max, return the max profit */