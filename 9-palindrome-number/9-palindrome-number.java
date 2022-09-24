class Solution {
    public boolean isPalindrome(int x) {
        
        int rev=0,num=x;
        if(num<0)
            return false;
        if(num%10==0 && num!=0)
            return false;
        while(x!=0)
        {
            rev = rev*10 +(x%10);
            x/=10;
        }
        if(rev==num)
            return true;
        else
            return false;
    }
}