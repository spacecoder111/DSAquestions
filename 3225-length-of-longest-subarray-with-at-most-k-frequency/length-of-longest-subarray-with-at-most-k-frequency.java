class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0,j=0;
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            while(map.get(nums[i])>k){
                int x=map.get(nums[j]);
                if(x==1){
                    map.remove(nums[j]);
                }else{
                    map.put(nums[j],x-1);
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}