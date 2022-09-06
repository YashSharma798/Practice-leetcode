class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n=nums.length;
        if(target < nums[0] && target<=0)
            return 0;
        if(target > nums[n-1])
            return n;
        for(int i=0; i<nums.length ; i++)
        {
            if(nums[i] == target || nums[i]>target)
                return i;
        }
        return 0;
    }
}