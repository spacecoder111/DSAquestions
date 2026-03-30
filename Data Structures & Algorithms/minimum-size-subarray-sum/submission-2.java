class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(nums[i]==target) return 1;
            if(sum>=target){
            min=Math.min(min,i-j+1);
            while(sum>=target){
                sum-=nums[j++];
            }
            min=Math.min(min,i-j+2);
            }
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}