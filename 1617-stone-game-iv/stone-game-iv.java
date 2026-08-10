class Solution {
    public boolean winnerSquareGame(int n) {
        int MAX=100000;
        boolean[] dp=new boolean[MAX+1];

        for (int i=0;i<=MAX;i++) {
            if(dp[i]) continue;
            for (int j=1;j*j<=MAX-i;j++)
                dp[i+j*j]=true;
        }
        return dp[n];
    }
}