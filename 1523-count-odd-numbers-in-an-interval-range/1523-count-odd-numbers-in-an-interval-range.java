class Solution {
    public int countOdds(int low, int high) {
        int cnt=0;
        int dif = high-low-1;
        
        
        if(low%2==1 && high%2==1)
        {
            if(low==high)
                return 1;
            int y = dif/2;
            cnt= y+2;
            return cnt;
        }
        else if(low%2==0 && high%2==0)
        {
            if(low==high)
                return 0;
            int y=dif/2;
            cnt=y+1;
            return cnt;
        }
        else
        {
            int y=dif/2;
            cnt=y+1;
            return cnt;
        }
        
      //  return c;
    }
}