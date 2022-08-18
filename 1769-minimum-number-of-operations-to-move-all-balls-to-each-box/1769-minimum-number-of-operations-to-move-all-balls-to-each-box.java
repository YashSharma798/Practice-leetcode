class Solution {
    public int[] minOperations(String boxes) {
        int n =boxes.length();
        int[] res = new int[n];
        
        for(int i=0 ; i<n ; i++)
        {
            int max=0;
            for(int j=0 ; j<n ; j++)
            {
                if(boxes.charAt(j)=='1' && i!=j)
                {
                    max = max+ Math.abs(i-j);
                }
            }
            res[i]=max;
            
        }
        return res;
    }
}