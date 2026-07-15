class Solution {
    int mod=1000000007;
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return (int)(solve(1,n,delay,forget,dp)%1000000007);
    }
    int solve(int idx,int n,int d,int f,int dp[]){
        if(n<idx) return 1;
        if(dp[idx]!=-1) return dp[idx];
        int c=idx+f<=n?0:1;
        for(int i=idx+d;i<=Math.min(f+idx-1,n);i++){
            c=(c+solve(i,n,d,f,dp))%mod;
        }
        return dp[idx]=c%mod;
    }
}