class Solution {
    public long minimumSteps(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        int i=0,j=n-1;
        long ans=0;
        while(i<=j){
            while(i<=j && ch[i]=='0') i++;
            while(i<=j && ch[j]=='1') j--;
            if(i<=j && ch[i]=='1' && ch[j]=='0'){
                ans+=j-i;
                i++;
                j--;
            }
        }
        return ans;
    }
}