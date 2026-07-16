class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0;
        int ans=Integer.MAX_VALUE;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
                while(sum>=target){
                    sum-=nums[j];
                    ans=Math.min(ans,i-j+1);
                    j++;
                }
        }
        return ans==Integer.MAX_VALUE?0:ans;
    }
}