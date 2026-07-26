class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int zer=0,neg=0,pos=0;
        for(int num:nums){
            if(num<0) neg++;
            if(num>0) pos++;
            if(num==0) zer++;
        }
        int a=nums[n-1];
        int b=nums[n-2];
        int c=nums[n-3];
        int d=nums[0];
        int e=nums[1];
        int f=nums[2];

        if(pos==0 && zer>0) return 0;
        if(pos==0) return a*b*c;
        if(neg<=1){
            return a*b*c;
        }
        // if(neg>=2){
        //     return Math.max(f*e*a,a*b*c); 
        // }
        return Math.max(d*e*a,a*b*c); 
    }
}