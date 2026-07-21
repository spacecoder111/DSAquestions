class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        if(n%2==0 && m%2==0) return 0;
        int x=0,y=0;
        for(int num:nums1){
            x=x^num;
        }
        for(int num:nums2){
            y=y^num;
        }
        if(n%2!=0 && m%2!=0) return x^y;
        if(n%2==0) return x;
        return y;
    }
}