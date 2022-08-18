class Solution {
    public int reverse(int x) {
        long rev=0,res;
        if(x<0)
        {
            x=x*-1;
            while(x!=0)
            {
               rev = rev*10 + (x%10);
               x/=10;
            }
            res = rev*-1;
        }
        else
        {
            while(x!=0)
            {
                rev = rev*10 + (x%10);
                x/=10;
             }
            res = rev;
        }
        if(res>2147483647 || res<-2147483648)
            return 0;
        return (int)res;
    }
}