class Solution {
    public int minAreaRect(int[][] points) {
        int n=points.length;
        Set<String> set=new HashSet<>();
        for(int i=0;i<n;i++){
                int x=points[i][0];
                int y=points[i][1];
                set.add(x+","+y);
        }

        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int x1=points[i][0];
            int y1=points[i][1];
            for(int j=i+1;j<n;j++){
                if(i==j) continue;
                int x2=points[j][0];
                int y2=points[j][1];
                 if(x1==x2 || y1==y2){
                    continue;
                }
                if(set.contains(x1+","+y2) && set.contains(x2+","+y1)){
                    min=Math.min(min,Math.abs(y2-y1)*Math.abs(x2-x1));
                }
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}