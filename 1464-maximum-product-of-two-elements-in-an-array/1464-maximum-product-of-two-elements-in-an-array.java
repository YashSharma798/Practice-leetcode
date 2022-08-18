class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        
        for(int i=0 ; i<n-1 ; i++)
        {
            for(int j=i+1 ; j<n ; j++){
                int p = (nums[i]-1)*(nums[j]-1);
                if(p>max)
                    max=p;
            }
        }
        return max;
    }
}