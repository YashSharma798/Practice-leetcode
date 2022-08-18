class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l=0,h=n-1;
        
        while(l<h){
            char temp = s[l];
            s[l]=s[h];
            s[h]=temp;
            
            l++;
            h--;
        }
       // System.out.println(s);
    }
}