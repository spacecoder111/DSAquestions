class Solution {
    public int hIndex(int[] citations) {
        int n=citations.length;
        //if(n==1 && citations[0]==0) return 0;
        Arrays.sort(citations);
        int ans=1,z=0;
        for(int j=0;j<=1000;j++){
            int c=0;
            for(int i=0;i<n;i++){
              if(citations[i]>=j) c++;
            //if(n-i+z>=citations[i]) ans=citations[i];
            }
            if(c>=j) ans=j;
        }
        return ans;
    }
}