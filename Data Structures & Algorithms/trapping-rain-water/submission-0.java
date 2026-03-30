class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int p[]=new int[n];
        int s[]=new int[n];
        p[0]=height[0];
        for(int i=1;i<n;i++){
           p[i]=Math.max(p[i-1],height[i]);

        }
        s[n-1]=height[n-1];
         for(int i=n-2;i>=0;i--){
           s[i]=Math.max(s[i+1],height[i]);
        }
        int ans=0;
        for(int i=0;i<n;i++){
            int m=Math.min(s[i],p[i]);
            ans+=m-height[i];
        }
        return ans;
    }
}
