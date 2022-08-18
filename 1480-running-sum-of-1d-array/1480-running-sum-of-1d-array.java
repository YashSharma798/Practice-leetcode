class Solution {
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int s=0,j=0;
        for(int i:nums){
            s=s+i;
            ans[j++]=s;
        }
        return ans;
    }
}