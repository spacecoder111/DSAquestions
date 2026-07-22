class Solution {
    public long maxStrength(int[] nums) {
        Arrays.sort(nums);
        int minneg=Integer.MAX_VALUE;
        int c=0,z=0,p=0;
        long mul=1;
        for(int num:nums){
            if(num==0){
                z++;
                continue;
            } 
            if(num<0){
                minneg=num;
                c++;
            }else if(num>0){
                p++;
            }
            mul*=num;
        }
        if(z==nums.length) return 0;
        if(minneg==Integer.MAX_VALUE) return mul;
        if(c%2==1){
            if(c==1 && p>0) return mul/minneg;
            if(c==1 && p==0 && z>0) return 0;
            if(c==1 && p==0 && z==0) return mul;
            return mul/minneg;
        } 
        return mul;
    }
}