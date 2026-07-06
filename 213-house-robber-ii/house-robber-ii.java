class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int a=recur(nums,0,n-1,dp);
        Arrays.fill(dp,-1);
        int b=recur(nums,1,n,dp);
        return Math.max(a,b);
    }
    int recur(int nums[],int i,int n,int dp[]){
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        int x=nums[i]+recur(nums,i+2,n,dp);
        int y=recur(nums,i+1,n,dp);
        return dp[i]=Math.max(x,y);
    }
}