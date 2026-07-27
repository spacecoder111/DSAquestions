class Solution {
    public long maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        long max1=Math.abs((long)nums[n-1]*nums[n-2]);
        long max2=Math.abs((long)nums[1]*nums[0]);
        long max3=Math.abs((long)nums[n-1]*nums[0]);
        long max=Math.max(max1,Math.max(max2,max3));
        return max*100000;
    }
}


// System.out.println(max1);
//         System.out.println(max2);
//         System.out.println(max3);

//  System.out.println(max);