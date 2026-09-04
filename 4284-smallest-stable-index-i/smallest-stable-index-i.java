class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            max=Math.max(nums[i],max);
            int min=Integer.MAX_VALUE;
            for(int j=i;j<nums.length;j++){
                min=Math.min(nums[j],min);
            }
            int a=max-min;
            if(a<=k){
               return i;
            }
        }
        return -1;
    }
}