// class Solution {
//     public int minOperations(int[] nums, int x) {
//         int n=nums.length;
//         int op=0;
//         int i=0,j=n-1;
//         while(i<=j){
//             if(nums[i]>=nums[j] && x-nums[i]>=0){
//                 x-=nums[i];
//                 i++;
//             }else{
//                 x-=nums[j];
//                 j--;
//             }
//             System.out.println(x);
//             op++;
//             if(x==0) return op;
//         }
//         return -1;
//     }
// }



class Solution {
    public int minOperations(int[] nums, int x) {

        int n = nums.length;
        int total = 0;
        for (int num : nums) total += num;

        int target = total - x;

        if (target < 0) return -1;
        if (target == 0) return n;

        int left = 0;
        int sum = 0;
        int longest = -1;

        for (int right = 0; right < n; right++) {
            sum += nums[right];

            while (left <= right && sum > target)
                sum -= nums[left++];

            if (sum == target)
                longest = Math.max(longest, right - left + 1);
        }

        return longest == -1 ? -1 : n - longest;
    }
}