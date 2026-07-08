class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] mat) {
    //     int n=heights.size();
    //     int m=heights.get(0).size();
    //     int arr[][]=new int[n][m];
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<m;j++){
    //             arr[i][j]=height.get(i).get(j);
    //         }
    //     }

    // }

    // public int countCoordinates(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            if(vis[i][0]) continue;
            dfs(mat,i,0,vis,n,m);
        }
        for(int i=0;i<m;i++){
            if(vis[0][i]) continue;
            dfs(mat,0,i,vis,n,m);
        }
         boolean vis2[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            if(vis2[i][m-1]) continue;
            dfs(mat,i,m-1,vis2,n,m);
        }
        for(int i=0;i<m;i++){
            if(vis2[n-1][i]) continue;
            dfs(mat,n-1,i,vis2,n,m);
        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<n;i++){
             for(int j=0;j<m;j++){
               if(vis[i][j] && vis2[i][j]) {
                ans.add(List.of(i,j));
               }
             }
        }
        return ans;
    }
    void dfs(int mat[][],int i,int j,boolean vis[][],int n ,int m){
        vis[i][j]=true;
        int dx[]={0,0,1,-1};
        int dy[]={1,-1,0,0};
        for(int k=0;k<4;k++){
            int x=dx[k]+i;
            int y=dy[k]+j;
            if(x>=0 && y>=0 && x<n && y<m && mat[i][j]<=mat[x][y] && !vis[x][y]){
                dfs(mat,x,y,vis,n,m);
            }
        }
    }
}