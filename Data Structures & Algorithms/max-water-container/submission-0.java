class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int i=0;
        int j=n-1;
        int max=0;
        while(i<j){
            if(heights[i]>heights[j]){
            max=Math.max(max,heights[j]*(j-i));
            j--;
            }else{
            max=Math.max(max,heights[i]*(j-i));
            i++;
            }
        }
        return max;
    }
}
