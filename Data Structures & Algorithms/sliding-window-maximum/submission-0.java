class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int ans[]=new int[n-k+1];
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->b[1]-a[1]);
        for(int i=0;i<k-1;i++){
            pq.offer(new int[]{i,nums[i]});
        }
        for(int i=k-1;i<n;i++){
            pq.offer(new int[]{i,nums[i]});
            while(!pq.isEmpty()){
            int a[]=pq.poll();
            if(a[0]<=i && a[0]>=i-k+1){
                ans[i-k+1]=a[1];
                pq.offer(new int[]{a[0],nums[a[0]]});
                break;
            }
        }
    }
        return ans;
    }
}
