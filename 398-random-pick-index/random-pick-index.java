class Solution {
    Map<Integer,ArrayList<Integer>> map;
    Random rand=new Random();

    public Solution(int[] nums) {
        this.map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }
    }
    
    public int pick(int target) {
        ArrayList<Integer> list=map.get(target);
        int x=rand.nextInt(0,list.size());
        return list.get(x);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int param_1 = obj.pick(target);
 */