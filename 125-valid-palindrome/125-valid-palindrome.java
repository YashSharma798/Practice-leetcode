class Solution {
    public boolean isPalindrome(String s) {
        int l = s.length();
        if(l==0)
            return true;
        String s1="";
        s=s.toLowerCase();
        s=s.replaceAll("[^A-Za-z0-9]", "");
        
        System.out.println(s);
        for(int i=s.length()-1 ; i>=0 ;i--)
        {
            s1=s1+s.charAt(i);
        }
        System.out.println(s1);
        if(s1.equals(s))
            return true;
        else
            return false;
    }
}