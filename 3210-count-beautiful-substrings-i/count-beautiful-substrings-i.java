class Solution {
    public int beautifulSubstrings(String s, int k) {
        int n=s.length();
        String vowel="aeiou";
        int ans=0;
        for(int i=0;i<n;i++){
            int v=0,c=0;
            for(int j=i;j<n;j++){
                char ch=s.charAt(j);
                if(vowel.contains(ch + "")) v++;
                else c++;
                if(v==c && v!=0 && c!=0 && (v*c)%k==0) ans++;
                //else if() ans++;
            }
        }
        return ans;
    }
}