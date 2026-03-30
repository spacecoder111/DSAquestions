class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int n:nums) set.add(n);
        int max=0;
        for(int n:nums){
            int c=0;
            if(!set.contains(n-1)){
                while(set.contains(n++)) c++;
            }
            max=Math.max(max,c);
        }
        return max;
    }
}
