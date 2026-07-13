class Solution {
    public int removeDuplicates(int[] nums) {
        int j=1;
        int c=1;
        int x=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                x++;
            }else{
                x=1;
            }
            if(x<=2){
                nums[j++]=nums[i];
                c++;
            }
        }
        return c;
    }
}