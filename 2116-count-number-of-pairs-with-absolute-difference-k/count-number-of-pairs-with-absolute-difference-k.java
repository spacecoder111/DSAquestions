class Solution {
    public int countKDifference(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        int ans=0;
        for(int num:nums){
            int x=num-k;
            int y=num+k;
            if(map.containsKey(x)){
                ans+=map.get(x);
            }
            if(map.containsKey(y)){
                ans+=map.get(y);
            }
            map.put(num,map.getOrDefault(num,0)+1);
        }
        return ans;
    }
}