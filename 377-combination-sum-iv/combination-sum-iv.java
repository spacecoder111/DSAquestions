class Solution {
    int x[]={0};
    public int combinationSum4(int[] nums, int target) {
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
       // Arrays.sort(nums);
       int dp[][]=new int[target+1][nums.length];
       for(int d[]:dp) Arrays.fill(d,-1);
        return solve(nums,target,0,dp);
        //return dp[target][nums.length-1];
    }
    public int solve(int[] c,int target,int idx,int dp[][]){
        
        if(target<0) return 0;
        if(target==0){
            return 1;
        }
       // if(idx>=c.length) return 0; 
        if(dp[target][idx]!=-1) return dp[target][idx];
        int ct=0;
        for(int i=0;i<c.length;i++){
         ct=ct+solve(c,target-c[i],i,dp); 
        }
        return dp[target][idx]=ct;
    }
}