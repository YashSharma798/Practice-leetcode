class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> list = new ArrayList<>();
        int n=candies.length;
     
        int maxValue=Integer.MIN_VALUE;
        for(int i=0;i<candies.length;++i){
            maxValue=Math.max(maxValue,candies[i]);
        }
        
        for(int i=0 ; i<candies.length ; i++)
        {
            int max = candies[i]+extraCandies;
            if(max >= maxValue)
                list.add(true);
            else
                list.add(false);
        }
        return list;
    }
}