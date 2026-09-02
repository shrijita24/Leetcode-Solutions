class Solution {
    public int maxProfit(int[] prices) {
        int maxProf=0;
        int minPrice=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            minPrice=Math.min(minPrice,prices[i]);
            int prof=prices[i]-minPrice;
            maxProf=Math.max(prof,maxProf);
        }
        return maxProf;
    }
}