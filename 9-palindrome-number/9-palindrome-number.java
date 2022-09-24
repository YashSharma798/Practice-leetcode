class Solution {
    public boolean isPalindrome(int x) {
        
        int rev=0,num=x;
        if(num<0)
            return false;
        if(num%10==0 && num!=0)
            return false;
        while(x>rev)
        {
            rev = rev*10 +(x%10);
            x/=10;
        }
        return rev == x || x == rev/10;
        // if(rev==num)
        //     return true;
        // else
        //     return false;
    }
}