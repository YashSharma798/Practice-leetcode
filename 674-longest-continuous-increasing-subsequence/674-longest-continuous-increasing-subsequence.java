class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int n = nums.length;
        if(n==1)
            return 1;
        int l=0,r=n-1;
        int max = Integer.MIN_VALUE;
        while(l<r)
        {
            int cnt=0;
            int i=l;
            while(i<r && nums[i]<nums[i+1])
            {
                cnt++;
                i++;
            }
            if(cnt>max)
                max=cnt;
            
            l++;
        }
        return max+1;
    }
}