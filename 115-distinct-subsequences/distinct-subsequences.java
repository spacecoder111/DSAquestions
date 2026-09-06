// class Solution {
//     int ans=0;
//     public int numDistinct(String s, String t) {
//        return solve(s,t,s.length(),t.length(),0,0);
//     }

//     int solve(String s,String t,int n,int m,int i,int j){
//         if(i==n) return 0;
//         if(j==m) return 1;
        
//         if(s.charAt(i)==t.charAt(j)) {
//             return 1+solve(s,t,n,m,i+1,j+1);
//         }
//         return solve(s,t,n,m,i+1,j);//+solve(s,t,n,m,i,j+1);
//     }
// }

class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length(), n = t.length();
        if (m < n) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            dp[i][n] = 1;
        }
        for (int i = m - 1; i >= 0; i--) {
            char sChar = s.charAt(i);
            for (int j = n - 1; j >= 0; j--) {
                char tChar = t.charAt(j);
                if (sChar == tChar) {
                    dp[i][j] = dp[i + 1][j + 1] + dp[i + 1][j];
                } else {
                    dp[i][j] = dp[i + 1][j];
                }
            }
        }
        return dp[0][0];
    }
}