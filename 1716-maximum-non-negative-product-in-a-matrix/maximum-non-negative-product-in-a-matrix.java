class Solution {
    int mod=1000000007;
    public int maxProductPath(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        long dpmax[][]=new long[n][m];
        long dpmin[][]=new long[n][m];
        dpmax[0][0]=grid[0][0];
        dpmin[0][0]=grid[0][0];
        for(int i=1;i<m;i++) {
            dpmax[0][i]=dpmax[0][i-1]*grid[0][i];
            dpmin[0][i]=dpmin[0][i-1]*grid[0][i];
        }
        for(int i=1;i<n;i++) {
            dpmax[i][0]=dpmax[i-1][0]*grid[i][0];
            dpmin[i][0]=dpmin[i-1][0]*grid[i][0];
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                long v1=dpmax[i-1][j]*grid[i][j];
                long v2=dpmax[i][j-1]*grid[i][j];
                long v3=dpmin[i-1][j]*grid[i][j];
                long v4=dpmin[i][j-1]*grid[i][j];
                dpmax[i][j]=Math.max(Math.max(v1,v2),Math.max(v3,v4));
                dpmin[i][j]=Math.min(Math.min(v1,v2),Math.min(v3,v4));
            }
        }
        long ans=Math.max(dpmax[n-1][m-1],dpmin[n-1][m-1]);
        if(ans<0) return -1;
        return (int)(ans%mod);
}


 // boolean vis[][]=new boolean[n][m];
        // long x=grid[0][0];
        // long ans=solve(grid,0,0,n,m,vis,x);
        // if(ans%mod<0) return -1;
        // return (int)(ans%mod);
// long solve(int grid[][],int i,int j,int n,int m,boolean vis[][],long t){
    //     if(i==n-1 && j==m-1) return t;
    //     if(vis[i][j]) return Long.MIN_VALUE;
    //     vis[i][j]=true;
    //     long a=Long.MIN_VALUE,b=Long.MIN_VALUE;
    //     if(i+1<n) a=solve(grid,i+1,j,n,m,vis,(t*grid[i+1][j]));
    //     if(j+1<m) b=solve(grid,i,j+1,n,m,vis,(t*grid[i][j+1]));
    //     vis[i][j]=false;
    //     return Math.max(a,b);
    // }
}