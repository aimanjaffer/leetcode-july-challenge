class IslandPerimeter{
    public int islandPerimeter(int[][] grid) {
    int sum=0;
     for(int i=0;i<grid.length;i++){
         for(int j=0;j<grid[0].length;j++){
             if(grid[i][j]==1){
                 if(i==0){
                    sum+=1;    
                 }  
                 if(i==grid.length-1){
                     sum+=1;    
                 }   
                 if(j==0){
                    sum+=1;    
                 }
                 if(j==grid[i].length-1){
                    sum+=1;    
                 }
                 if(i!=0 && j!=0 && i!=grid.length-1 && j!=grid[i].length-1 && !(grid[i-1][j]==1 && grid[i+1][j]==1 && grid[i][j+1]==1 && grid[i][j-1]==1)){ 
                    if(grid[i-1][j]==0)
                        sum+=1;
                    if(grid[i+1][j]==0)
                        sum+=1;
                    if(grid[i][j-1]==0)
                        sum+=1;
                    if(grid[i][j+1]==0)
                        sum+=1;
                 }
                if(i==0 || i == grid.length-1 || j==0 || j == grid[i].length-1){
                    if(i!=grid.length-1 && grid[i+1][j]==0)
                        sum+=1;
                    if(i!=0 && grid[i-1][j]==0)
                        sum+=1;
                    if(j!=0 && grid[i][j-1]==0)
                        sum+=1;
                    if(j!=grid[i].length-1 && grid[i][j+1]==0)
                        sum+=1;     
                 }
             }
         }
     }
        return sum;
    }
}