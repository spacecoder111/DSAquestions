class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        Arrays.sort(citations);
        int ans=1,z=0;
        for(int j=0;j<=1000;j++){
            int c=0;
            for(int i=0;i<n;i++){
              if(citations[i]>=j) c++;
            }
            if(c>=j) ans=j;
        }
        return ans;
    }
}