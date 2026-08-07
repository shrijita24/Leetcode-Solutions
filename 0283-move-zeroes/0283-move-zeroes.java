class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=0)
            {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
        }
    }
}
/*We have an array containing zero and non-zero elements. We want to put all the non-zero elements first and the zeroes at the end. i points to the position where the next non-zero element should be placed, while j scans the entire array. Whenever j finds a non-zero element, we swap nums[j] with nums[i], because i is the position where that non-zero belongs. Then we increment i so it points to the position for the next non-zero element.*/