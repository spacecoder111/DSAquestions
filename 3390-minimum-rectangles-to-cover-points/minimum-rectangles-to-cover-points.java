class Solution {
    public int minRectanglesToCoverPoints(int[][] points, int w) {
        int n=points.length;
        Arrays.sort(points,(a,b)->a[0]-b[0]);
        int min=points[0][0];
        int max=points[0][0]+w;
        int i=0;
        int ans=0;
        while(i<n){
            while(i<n && max>=points[i][0]) i++;
            ans++;
            if(i<n) max=points[i][0]+w;
        }
        return ans;
    }
}