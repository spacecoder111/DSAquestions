class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n=grid.length;
        int m=grid[0].length; 
        int p=n*m;
        k=k%p;
        int mat[]=new int[p];
        int l=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[l++]=grid[i][j];
            }
        }

        List<List<Integer>> list=new ArrayList<>();
        int x=(p-k)%p;
         for(int i=0;i<n;i++){
            List<Integer> t=new ArrayList<>();
            for(int j=0;j<m;j++){
                x=x%p;
                t.add(mat[x]);
                x++;
            }
            list.add(t);
        }
        return list;
    }
}