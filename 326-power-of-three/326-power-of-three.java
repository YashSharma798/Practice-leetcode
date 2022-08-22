class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        if(n==1)
            return true;
        long x=3;
         while((int)x <= n)
         {
             if(x==n)
                 return true;
             else{
                 x*=3;
                 if(x>Integer.MAX_VALUE)
                     break;
             }
         }
        return false;
    }
}