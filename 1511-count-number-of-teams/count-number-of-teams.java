class Solution {
    public int numTeams(int[] rating) {
        int n=rating.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int x=rating[i];
            for(int j=i+1;j<n;j++){
                int y=rating[j];
                boolean vis=x>y;
                int c=0; 
                for(int k=j+1;k<n;k++){
                    if(vis && y>rating[k]) c++;
                    if(!vis && y<rating[k]) c++;
                }
                ans+=c;
            }
        }
        return ans;
    }
}