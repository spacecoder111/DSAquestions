class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        // int y=Integer.MIN_VALUE;
         int t=1;
        // boolean vis=false;
        for(int i=0;i<n;i++){
            // if(nums[i]==0){
            //     if(vis) ans=Math.max(ans,t/y);
            //     else ans=Math.max(ans,t);
            //     vis=false;
            //     y=1;
            //     t=1;
            //     continue;
            // }
            // t=t*nums[i];
            // if(vis) y*=nums[i];
            // if(nums[i]<0) {
            //     vis=true;
            //     y=nums[i];
            //     //min=Math.max(nums[i],min);
            // }
            t*=nums[i];
            ans=Math.max(ans,t);
            if(t==0) t=1;
        }
        t=1;
        for(int i=n-1;i>=0;i--){
             t*=nums[i];
            ans=Math.max(ans,t);
            if(t==0) t=1;
        }
        return ans;
    }
}

//    int s=0;
        // int max=Integer.MIN_VALUE;
        // for(int num:nums){
        //     s+=num;
        //     max=Math.max(s,max);
        //     if(s<=0){
        //         s=0;
        //     }
        // }
        // return max;