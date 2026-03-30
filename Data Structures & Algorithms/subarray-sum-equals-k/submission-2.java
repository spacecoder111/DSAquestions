class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0,sum=0;
        map.put(0,1);
        for(int num:nums){
            sum+=num;
            int x=sum-k;
            if(map.containsKey(x)) ans+=map.get(x);
             map.put(sum,map.getOrDefault(sum,0)+1);
        } 
        return ans;
    }
}