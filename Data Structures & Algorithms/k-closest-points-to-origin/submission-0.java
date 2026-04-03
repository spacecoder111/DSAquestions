class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        for(int[] p:points){
            int x=p[0]*p[0];
            int y=p[1]*p[1];
            int z=x+y;
            pq.offer(new int[]{p[0],p[1],z});
        }
        int ans[][]=new int[k][2];
        int j=0;
        while(k-->0){
            int[] a=pq.poll();
            ans[j][0]=a[0];
            ans[j][1]=a[1];
            j++;
        }
        return ans;
    }
}
