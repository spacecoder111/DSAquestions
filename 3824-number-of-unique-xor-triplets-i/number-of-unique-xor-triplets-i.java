class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int n=nums.length;
        if(n<3) return n;
        // int x=n-2;
        // int y=(x*(x+1))/2;
        int bits = 0;
        while ((n >> bits) > 0) {
            bits++;
        }
        return 1<<bits;
    }
}