class Solution {
    public int arraySign(int[] nums) {
        int p=1;
        for(long i:nums)
        {
            if(i==0)
                return 0;
            if(i<0)
                p=p*-1;
            else
                p=p*1;
           
        }
        return p;
        
    }
}