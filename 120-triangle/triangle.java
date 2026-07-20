class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int m=triangle.get(n-1).size();
        int dp[]=new int[m];
        List<Integer> list=triangle.get(n-1);
        for(int i=0;i<m;i++){
            dp[i]=list.get(i);
        }

        for(int i=n-2;i>=0;i--){
            int p=triangle.get(i).size();
            int newdp[]=new int[m];
            List<Integer> l=triangle.get(i);
            for(int j=0;j<l.size();j++){
               newdp[j]=Math.min(dp[j]+l.get(j),dp[j+1]+l.get(j));
            }
            dp=newdp;
        }
        return dp[0];
    }
}