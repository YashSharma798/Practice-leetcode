class Solution {
    public String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] t= new char[n];
       // int k=0;
        
        for(int i=0 ; i<n ; i++)
        {
            t[indices[i]] = s.charAt(i);
            
        }
        String str = new String(t);
        
        return str;
    }
}