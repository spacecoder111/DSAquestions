class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int dp[][][]=new int[m+1][n+1][strs.length];
        for(int x[][]:dp)
        for(int d[]:x)
        Arrays.fill(d,-1);
       return solve(strs,m,n,0,dp);
    }
    int solve(String[] s, int m,int n, int i,int dp[][][]){
        if(i>=s.length || m<0 || n<0) return 0;
        if(dp[m][n][i]!=-1) return dp[m][n][i];
        int z=0;
        for(char ch:s[i].toCharArray()){
            if(ch=='0') z++;
        }
        int o=s[i].length()-z;
        int a=0;
        if(m-z>=0 && n-o>=0) a=1+solve(s,m-z,n-o,i+1,dp);
        int b=solve(s,m,n,i+1,dp);
        return dp[m][n][i]=Math.max(a,b);
    }
}

