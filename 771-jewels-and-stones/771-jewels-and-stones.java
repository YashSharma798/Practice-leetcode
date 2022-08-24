class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int cnt=0;
        for(char j:jewels.toCharArray())
        {
            for(char s:stones.toCharArray())
            {
                if(s==j)
                    cnt++;
            }
        }
        return cnt;
    }
}