class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int totSum=n*(n+1)/2;
        int arrSum=0;
        for(int x:nums)
            arrSum+=x;
        return totSum-arrSum; 
    }
}