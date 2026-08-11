class Solution {
    public int missingInteger(int[] nums) {
     // Arrays.sort(nums);
      int n=nums.length;
      Set<Integer> set=new HashSet<>();
      for(int num:nums) set.add(num);
      int sum=nums[0];
      for(int i=1;i<n;i++){
        if(nums[i-1]+1==nums[i]) sum+=nums[i];
        else break;
      }
      while(set.contains(sum)) sum++;
      return sum;
    }
}