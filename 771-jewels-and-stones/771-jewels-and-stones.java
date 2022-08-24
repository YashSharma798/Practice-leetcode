class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(char j:stones.toCharArray())
        {
            for(char s:jewels.toCharArray())
            {
                if(s==j)
                    cnt++;
            }
        }
        return cnt;
    }
}