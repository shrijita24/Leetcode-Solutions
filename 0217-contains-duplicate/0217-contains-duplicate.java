class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums)
        {
            while(set.contains(x))
                return true;
        
            set.add(x);
        }
        return false;
    }
}