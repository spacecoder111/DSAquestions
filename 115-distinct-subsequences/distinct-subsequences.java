class Solution {
    public int numDistinct(String s, String t) {
        int dp[][]=new int[s.length()][t.length()];
        for(int x[]:dp) Arrays.fill(x,-1);
       return solve(s,t,s.length(),t.length(),0,0,dp);
    }

    int solve(String s,String t,int n,int m,int i,int j,int dp[][]){
        
        if(j==m) return 1;
        if(i==n) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s.charAt(i)==t.charAt(j)) {
            return dp[i][j]=solve(s,t,n,m,i+1,j+1,dp)+solve(s,t,n,m,i+1,j,dp);
        }
        return dp[i][j]=solve(s,t,n,m,i+1,j,dp);
    }
}