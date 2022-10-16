class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        
        Arrays.sort(arr2);
        int count=0;
        for(int val:arr1)
        {
            if(Inorder(arr2,val-d,val+d))
                count++;
        }
        return count;
    }
    private boolean Inorder(int[] arr,int a, int b)
    {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end)
        {
            int mid= start+(end-start)/2;
            if(arr[mid]>=a && arr[mid]<=b)
                return false;
            else if(arr[mid]<a)
                start=mid+1;
            else
                end=mid-1;
        }
        return true;
    }
}