class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m= mat.length;
        int[] index = new int[m];
        int[] res = new int[m];
        
        for(int i=0 ; i<m ; i++){
            int cnt=0;
            for(int j=0 ; j<mat[i].length ; j++){
                if(mat[i][j]==1)
                    cnt++;
            }
            res[i]=cnt;
            index[i]=i;
        }
        
        for(int i=0 ; i<res.length-1 ; i++ )
        {
            for(int j=0 ; j<(res.length-1-i) ; j++)
            {
                if(res[j]>res[j+1])
                {
                    int temp1 = res[j];
                    res[j]=res[j+1];
                    res[j+1]=temp1;
                    
                    int temp2 = index[j];
                    index[j]=index[j+1];
                    index[j+1]=temp2;
                }
            }
        }
        int[] kweak = new int[k];
        
        for(int i=0 ; i<k ; i++)
        {
            kweak[i] = index[i];
        }
        
        return kweak;
    }
}