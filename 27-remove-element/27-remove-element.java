class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        int j=0;
        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]!=val)
                list.add(nums[i]);
        }
        int i=0;
        for(int num:list)
            nums[i++]=num;
        
        return i;
    }
}