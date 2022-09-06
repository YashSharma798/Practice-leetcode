class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        //n=n+1;
        int c=0;
      
        int sum = (n*(n+1))/2;
        int s=0;
        for(int i:nums)
        {
            s=s+i;
        }
        return sum-s;
    }
}