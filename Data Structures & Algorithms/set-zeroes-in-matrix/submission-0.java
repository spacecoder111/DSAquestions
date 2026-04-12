class Solution {
    public void setZeroes(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        Set<Integer> row=new HashSet<>();
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==0) list.add(Arrays.asList(i,j));
            }
        }
        for(int i=0;i<list.size();i++){
            List<Integer> l=list.get(i);
            int a=l.get(0);
            int b=l.get(1);
             for(int j=0;j<m;j++){
                matrix[a][j]=0;
            }
             for(int k=0;k<n;k++){
                matrix[k][b]=0;
            }
        }
    }
}
