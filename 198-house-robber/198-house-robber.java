class Solution {
    public int rob(int[] nums) {
        int res[]= new int[nums.length];
        int n=nums.length;
        if(n==0 || nums == null) return 0;
        if(n==1)
            return nums[0];
        if(n==2) return Math.max(nums[0],nums[1]);
        
        res[0]=nums[0];
        res[1]=Integer.max(nums[1],nums[0]);
        
        for(int i=2 ; i<n  ; i++)
        {
            res[i]=nums[i]+res[i-2];
            
            if(res[i]<res[i-1])
                res[i]=res[i-1];
            
        }
        return res[n-1];
    }
}