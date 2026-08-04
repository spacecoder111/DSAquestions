class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[n-1];
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(nums[i]);
        }
        int x=max-min-n+1;
        if(x==0) return new ArrayList<>();
        List<Integer> ans=new ArrayList<>();
        int j=0;
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)) ans.add(i);
        }
        return ans;
    }
}