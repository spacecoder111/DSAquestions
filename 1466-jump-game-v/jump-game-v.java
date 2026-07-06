class Solution {
    public int maxJumps(int[] arr, int d) {
        int n=arr.length;
        int max=0;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        for(int i=0;i<n;i++){
            max=Math.max(max,solve(arr,i,n,d,dp));
        }
        return max;
    }
    int solve(int[] arr,int i,int n,int d,int[] dp){
        if(dp[i]!=-1) return dp[i];
        int max=1;
        for(int j=i+1;j<=Math.min(i+d,n-1);j++){
            if( arr[i]<=arr[j]) break;
            max=Math.max(max,1+solve(arr,j,n,d,dp));
        }
        for(int j=i-1;j>=Math.max(i-d,0);j--){
            if(j<0 || arr[i]<=arr[j]) break;
            max=Math.max(max,1+solve(arr,j,n,d,dp));
        }
        return dp[i]=max;
    }
}