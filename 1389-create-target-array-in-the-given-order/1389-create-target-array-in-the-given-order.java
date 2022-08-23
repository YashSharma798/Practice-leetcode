class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n= nums.length;
        int[] res= new int[index.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0 ; i<index.length ; i++)
        {
            list.add(index[i],nums[i]);
        }
        
        for(int i=0 ; i<list.size() ; i++)
        {
            res[i] = list.get(i);
        }
        
        return res;
    }
}