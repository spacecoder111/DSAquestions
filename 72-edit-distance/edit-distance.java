class Solution {
    public int minDistance(String word1, String word2) {
        int n=word1.length();
        int m=word2.length();
        int dp[][]=new int[n][m];
        for(int d[]:dp) Arrays.fill(d,-1);
        return solve(word1,word2,n-1,m-1,dp);
    }
    int solve(String w1, String w2,int i,int j,int dp[][]){
        if(j<0){
            return i+1;
        }
         if(i<0){
            return j+1;
        }
        if(dp[i][j]!=-1) return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]=solve(w1,w2,i-1,j-1,dp);
        }
       return dp[i][j]=1+Math.min(solve(w1,w2,i-1,j,dp),Math.min(solve(w1,w2,i,j-1,dp),solve(w1,w2,i-1,j-1,dp)));
    }
}