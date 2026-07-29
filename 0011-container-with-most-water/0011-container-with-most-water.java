import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea1=0;
        while(left<right)
        {
            int width=right-left;
            int minHeight=Math.min(height[left],height[right]);
            int area=width*minHeight;
            maxArea1=Math.max(area,maxArea1);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea1;
    }
}