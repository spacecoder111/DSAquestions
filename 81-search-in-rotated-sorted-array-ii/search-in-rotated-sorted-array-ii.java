class Solution {
    public boolean search(int[] nums, int target) {
        int n=nums.length;
        int i=0,j=n-1;
        while(i<=j){
            int m=i+(j-i)/2;
            if(nums[m]==target) return true;
            if(nums[i]==nums[m]) {
                i++;
                continue;
            }
            if(nums[i]<=nums[m]){
                if(nums[i]<=target && target<nums[m]){
                    j=m-1;
                }else{
                    i=m+1;
                }
            }else{
                if(nums[m]<target && target<=nums[j]){
                    i=m+1;
                }else{
                    j=m-1;
                }
            }
            
        }
        return false;
    }
}