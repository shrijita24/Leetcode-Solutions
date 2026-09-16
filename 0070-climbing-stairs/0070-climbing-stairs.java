class Solution {
    public int climbStairs(int n) {
        int first=1;
        int second=2;
        int current=0;
        if(n==1)
            return first;
        for(int i=3;i<=n;i++)
        {
            current=first+second;
            first=second;
            second=current;
        }
        return second;
    }
}