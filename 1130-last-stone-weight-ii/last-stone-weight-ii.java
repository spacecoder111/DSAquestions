class Solution {
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int t=0;
        for(int s:stones) t+=s;
        int dp[][]=new int[n][t+1];
        for(int d[]:dp)
        Arrays.fill(d,-1);
        return solve(stones,0,0,n,t,dp);
    }
    int solve(int s[],int i,int sum,int n,int t,int dp[][]){
        if(i==n){
            int sum2=t-sum;
            return Math.abs(sum2-sum);
        }
        if(dp[i][sum]!=-1) return dp[i][sum];
        int a=solve(s,i+1,sum+s[i],n,t,dp);
        int b=solve(s,i+1,sum,n,t,dp);
        return dp[i][sum]=Math.min(a,b);
    }
}