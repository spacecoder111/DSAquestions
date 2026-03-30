class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n=nums.length;
       int pr[]=new int[n];
       int su[]=new int[n]; 
       pr[0]=1;
       for(int i=1;i<n;i++){
        pr[i]=pr[i-1]*nums[i-1];
       }
       su[n-1]=1;
       for(int i=n-2;i>=0;i--){
        su[i]=su[i+1]*nums[i+1];
       }
       for(int i=0;i<n;i++){
        nums[i]=su[i]*pr[i];
       }
       return nums;
    }
}  
