class Solution {
    public void setZeroes(int[][] matrix) {
         if(matrix==null || matrix.length==0){
            return;
        }
        
        int n = matrix.length;
        int m = matrix[0].length;
        int row []  = new int[n];
        int col [] = new int [m];
        
        //Initalizing 1-d arrays
        for(int i=0; i<n; i++){
            row[i]=1;
        }
        for(int j=0; j<m; j++){
            col[j]=1;
        }
        
        //for getting values
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0 ){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        //Setting up values
        
        for(int i=0; i<n; i++){
          for(int j=0; j<m; j++){
            if(row[i]==0||col[j]==0){
                 matrix[i][j] = 0;
               }
           }
       }
    }
    
        
}