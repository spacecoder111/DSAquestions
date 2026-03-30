class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n=s1.length();
        int m=s2.length();
        int arr[]=new int[26];
        int arr2[]=new int[26];
        int j=0;
        for(int i=0;i<n;i++){
            int a=s1.charAt(i)-'a';
            arr[a]++;
        }
        for(int i=0;i<m;i++){
            int a=s2.charAt(i)-'a';
            arr2[a]++;
            if(i>=n-1){
                for(int k=0;k<26;k++){
                    if(arr[k]!=arr2[k]) break;
                    if(k==25) return true;
                }
                int v=s2.charAt(j++)-'a';
                arr2[v]--;
            }
        }
        return false;
    }
}
