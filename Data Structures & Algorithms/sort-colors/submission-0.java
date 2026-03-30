class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h){
            if(nums[m]==0){
            swap(nums,m,l);
            l++;
            m++;
            }else if(nums[m]==1){
                m++;
            }else{
                swap(nums,m,h);
                h--;
            }
        }
       }
       void swap(int nums[],int p,int q){
           int temp=nums[p];
                nums[p]=nums[q];
                nums[q]=temp;
                return ;
       }
}