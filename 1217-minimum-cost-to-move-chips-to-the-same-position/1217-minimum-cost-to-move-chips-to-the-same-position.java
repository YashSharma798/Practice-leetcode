class Solution {
    public int minCostToMoveChips(int[] position)
    {
        int n = position.length;
        int even=0,odd=0;
        
        for(int i=0 ; i<n ; i++){
            if(position[i]%2 == 0)
                even = even+1;
            else
                odd = odd+1;
        }
        if(even >= odd)
            return odd;
        else
            return even;
    }
}