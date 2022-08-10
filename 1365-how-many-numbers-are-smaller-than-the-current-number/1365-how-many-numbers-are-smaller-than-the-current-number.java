class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int k=0;
        
        for(int i:nums)
        {
            int cnt=0;
            for(int j:nums){
                if(j < i)
                    cnt++;
                
            }
            res[k++]=cnt;
        }
        return res;
    }
}