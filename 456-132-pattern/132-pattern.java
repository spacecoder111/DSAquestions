class Solution {
    public boolean find132pattern(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        int sec=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(sec>nums[i]) return true;
            while(!st.isEmpty() && nums[i]>st.peek()) sec=st.pop();
            st.push(nums[i]);
        }
        return false;
    }
}

//  int min[]=new int[n];
//         int max[]=new int[n];
//         min[0]=nums[0];
//         for(int i=1;i<n;i++){
//             min[i]=Math.min(min[i-1],nums[i]);
//         }
//         max[n-1]=nums[n-1];
//         for(int i=n-2;i>=0;i--){
//             max[i]=Math.max(nums[i],max[i+1]);
//             //max[i]=Math.min(nums[i],max[i+1]);
//         }
//         for(int i=1;i<n-1;i++){
//             if(nums[i]>min[i-1] && nums[i]>max[i+1] && min[i-1]<max[i+1]) return true;
//         }