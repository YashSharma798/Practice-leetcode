class Solution {
    public void moveZeroes(int[] nums) {
        int[] temp= new int[nums.length];
        int count=0;
        for(int i:nums)
        {
            if(i!=0){
                temp[count++]=i;
            }
        }
        for(int i=0 ; i<nums.length ;i++)
        {
            nums[i]=temp[i];
        }
    }
}