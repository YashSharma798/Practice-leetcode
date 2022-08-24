class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String str1="";
        String str2="";
        
        for(int i=0 ; i<word1.length; i++)
        {
            str1=str1+word1[i];
        }
        for(int i=0 ; i<word2.length; i++)
        {
            str2=str2+word2[i];
        }
        
        if(str1.equals(str2))
            return true;
        return false;
        
        //by using join method 
        /*String s1 = String.join("", word1);
          String s2 = String.join("", word2);
          return s1.equals(s2);*/


        
    }
}