class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int n=matrix.length,m=matrix[0].length;
        int srow=0,scol=0,erow=n-1,ecol=m-1;

        ArrayList<Integer> list=new ArrayList<>();
        while(srow<=erow && scol<=ecol){
            for(int i=srow;i<=ecol;i++){
                list.add(matrix[srow][i]);
            }

            for(int i=scol+1;i<=erow;i++){
                list.add(matrix[i][ecol]);
            }

            for(int i=ecol-1;i>=srow;i--){
                 if(srow==erow) break;
                // if(scol==ecol) break;
                list.add(matrix[erow][i]);
            }

            for(int i=erow-1;i>scol;i--){
                // if(srow==erow) break;
                if(scol==ecol) break;
                list.add(matrix[i][srow]);
            }

            srow++;
            scol++;
            erow--;
            ecol--;
        }
        return list;
    }
}