class Solution {
    public int splitArray(int[] nums, int k) {
        int l=nums[0];
        int h=0;
        for(int num:nums){
            l=Math.max(l,num);
            h+=num;
        }
        int ans=0;
        while(l<=h){
            int m=(l+h)/2;
            if(check(m,nums,k)){
                ans=m;
                h=m-1;
            }else{
                l=m+1;
            }
        }
        return ans;
    }
    boolean check(int m,int nums[],int k){
        int s=0;
        int c=1;
        for(int num:nums){
            //if(num>m) return false;
            if(s+num>m){
                s=num;
                c++;
            }else{
                s+=num;
            }
        }
        return k>=c;
    }
}