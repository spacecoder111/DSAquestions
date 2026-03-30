class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            for(int p=i+1;p<n;p++){
            if(p!=i+1 && nums[p]==nums[p-1]) continue;
            int j=p+1;
            int k=n-1;
            while(j<k){
                long sum=(long)nums[i]+nums[p]+nums[j]+nums[k];
                if(sum==target){
                    list.add(Arrays.asList(nums[i],nums[p],nums[j],nums[k]));
                    j++;
                    k--;
                while(j<k && nums[j]==nums[j-1]) j++;
                while(j<k && nums[k]==nums[k+1]) k--;
                }else if(sum<target){
                   j++;
                }else{
                    k--;
                }
             }
            }
        }
        return list;
    }
}