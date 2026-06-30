import java.util.*;
class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=prices[0];
        int maxProfit=0;
        for(int price:prices)
        {
            int profit=price-minPrice;
            minPrice=Math.min(minPrice,price);
            maxProfit=Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}