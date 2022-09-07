class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        
        for(int i:nums1)
            set.add(i);
        for(int j:nums2)
        {
            if(set.contains(j))
                set1.add(j);
        }
        
        int[] res = new int[set1.size()];
        int count=0;
        for(int i:set1)
            res[count++]=i;
        return res;
    }
}