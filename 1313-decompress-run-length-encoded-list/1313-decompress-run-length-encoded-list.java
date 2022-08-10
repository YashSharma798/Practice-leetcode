class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n =nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int k= 0,c=0;
        for( int i=0 ; i+1 < n ; i+=2){
            int p=nums[i];
            int q=nums[i+1];
            while(p-- > 0){
                arr.add(q);
            }


        }
        int[] res = new int[arr.size()];
        for (int i = 0; i < res.length; ++i) res[i] = arr.get(i);
        return res;
    }
}