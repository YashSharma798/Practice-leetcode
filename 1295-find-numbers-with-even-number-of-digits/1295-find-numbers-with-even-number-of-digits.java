class Solution {
    public int findNumbers(int[] nums) 
    {
        int even=0;
        for(int n:nums)
        {
            int cnt=0;
            while(n>0)
            {
                n=n/10;
                cnt++;
            }
            if(cnt%2==0)
                even++;
        }
        return even;
    }
}