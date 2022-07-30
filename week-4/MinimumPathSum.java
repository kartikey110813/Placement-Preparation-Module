class Solution {
     public int minPathSum(int[][] grid) {
    int gridrow=grid.length-1;
    int gridcol=grid[0].length-1;
    int[] prev=new int[gridcol+1];
    for(int i=0;i<=gridrow;i++)
    {
        int[] curr=new int[gridcol+1];
        for(int j=0;j<=gridcol;j++)
        {
            if(i==0&&j==0)
                curr[j]=grid[i][j];
            else{
           int up = grid[i][j];
            if(i>0) up += prev[j];
            else up += (int)Math.pow(10,9);
            
            int left = grid[i][j];
            if(j>0) left+=curr[j-1];
            else left += (int)Math.pow(10,9);
            
            curr[j] = Math.min(up,left);
        }}
        prev=curr;   
    }
    return prev[gridcol];
    }
}
