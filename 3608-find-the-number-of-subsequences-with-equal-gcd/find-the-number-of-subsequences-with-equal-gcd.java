class Solution {
    int mod=1000000007;
    public int subsequencePairCount(int[] nums) {
        int dp[][][]=new int[nums.length+1][201][201];
        for(int d[][]:dp)
        for(int e[]:d)
        Arrays.fill(e,-1);
        return solve(nums,0,0,0,dp);
    }
    int solve(int nums[],int i,int gcd1,int gcd2,int dp[][][]){
        if(dp[i][gcd1][gcd2]!=-1) return dp[i][gcd1][gcd2];
        if(nums.length==i) {
            return (gcd1!=0 && gcd1==gcd2)?1:0; 
        }
        int c=0;
        c=solve(nums,i+1,gcd1,gcd2,dp)%mod;
        int x=(gcd1==0)?nums[i]:gcd(nums[i],gcd1);
        c=(c+solve(nums,i+1,x,gcd2,dp))%mod;
        int y=(gcd2==0)?nums[i]:gcd(nums[i],gcd2);
        c=(c+solve(nums,i+1,gcd1,y,dp))%mod;
        return dp[i][gcd1][gcd2]=(int)c;
    }
    int gcd(int x,int y){
        if(x==0) return y;
        return gcd(y%x,x);
    }
}