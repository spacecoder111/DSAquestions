class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> windowCount = new HashMap<>();

        for (int i = 0; i <= n - k; i++) {
            Set<Integer> seen = new HashSet<>();
            for (int j = i; j < i + k; j++) {
                seen.add(nums[j]);
            }
            for (int x : seen) {
                windowCount.put(x, windowCount.getOrDefault(x, 0) + 1);
            }
        }

        int ans = -1;
        for (int x : windowCount.keySet()) {
            if (windowCount.get(x) == 1) {
                ans = Math.max(ans, x);
            }
        }
            
        return ans;
    }
}
