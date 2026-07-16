class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        int prefixgcd[]=new int[n];
        prefixgcd[0]=nums[0];
        int max=nums[0];
        for(int i=1;i<n;i++){
            max=Math.max(max,nums[i]);
            prefixgcd[i]=gcd(nums[i],max);
        }
        Arrays.sort(prefixgcd);
        int i=0,j=n-1;
        long ans=0;
        while(i<j){
            ans+=gcd(prefixgcd[i],prefixgcd[j]);
            i++;
            j--;
        }
        return ans;
    }
    int gcd(int a,int b){
        if(a==0) return b;
        return gcd(b%a,a);
    }
}