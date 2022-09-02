class Solution {
    public int maxProductDifference(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0 ; i<n ; i++)
        {
            for(int j=i+1 ; j<n ; j++){
                int p=nums[i]*nums[j];
                if(p>max)
                    max=p;
                if(p<min)
                    min=p;
            }
        }
        return max-min;
    }
}