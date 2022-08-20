class Solution
{
    public int countGoodTriplets(int[] arr, int a, int b, int c) 
    {
        int n = arr.length;
        int cnt=0;
        
        for( int i=0 ; i<n-2 ; i++)
        {
            for(int j=i+1 ; j<n-1 ; j++)
            {
                for(int k=j+1 ; k<n ; k++)
                {
                    int p= Math.abs(arr[i]-arr[j]);
                    int q= Math.abs(arr[j]-arr[k]);
                    int r= Math.abs(arr[i]-arr[k]);
                    
                    if(p<=a && q<=b && r<=c)
                    {
                        cnt++;
                    }
                }
            }
        }
        
        return cnt;
        
    }
}