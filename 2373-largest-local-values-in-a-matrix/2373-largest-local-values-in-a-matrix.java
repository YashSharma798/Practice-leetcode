class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n-2][n-2];
        int p=0,q=0;
        
        for(int i=0 ; i < n-2 ; i++){
            for(int j=0 ; j<n-2 ; j++){
                res[i][j] = maxValue(grid,i,j);
            }
        }
        return res;
    }
        
        public int maxValue(int[][] arr,int r,int c)
        {
            int max = Integer.MIN_VALUE;
            for(int i=r ; i<r+3 ; i++){
                for(int j=c ; j<c+3 ; j++)
                {
                    if(arr[i][j] > max)
                        max=arr[i][j];
                }
            }
            return max;
            
        }
}