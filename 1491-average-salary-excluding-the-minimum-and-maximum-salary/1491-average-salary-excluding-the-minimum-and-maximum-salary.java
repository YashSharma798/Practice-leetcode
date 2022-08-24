class Solution {
    public double average(int[] salary) {
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n=salary.length;
        
        for(int i=0 ; i<salary.length ; i++)
        {
            if(salary[i] < min)
                min=salary[i];
            if(salary[i]>max)
                max=salary[i];
        }
        double sum=0;
        for(int i=0 ; i<salary.length ; i++)
        {
            if(salary[i]!=min && salary[i]!=max)
            {
                sum=sum+salary[i];
            }
        }
        return sum/(n-2);
    }
}