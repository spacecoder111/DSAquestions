class Solution {
    public int characterReplacement(String s, int k) {
        int j=0,ans=0;
        int maxf=1;
        char ch[]=s.toCharArray();
        int arr[]=new int[26];
        char maxc=ch[0];
        arr[maxc-'A']++;
        for(int i=1;i<s.length();i++){
            int a=ch[i]-'A';
            arr[a]++;
           maxf=Math.max(maxf,arr[a]);
            while(i-j-maxf+1>k){
                int b=ch[j]-'A';
                 arr[b]--;
                j++;
        }
        ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}

//  if(ch[i]!=maxc) k--;
//             if(k<=0){
//                 while(j<i && k<=0){
//                     if(ch[j]!=maxc) k++;
//                     arr[ch[j]-'A']--;
//                     if(maxc==ch[j]){
//                         maxf=arr[ch[j]-'A'];
//                     }
//                     if(maxf<arr[ch[j]-'A']){
//                         maxf=arr[ch[j]-'A'];
//                         maxc=ch[j];
//                     }
//                     j++;
//                 }
//             }
//              ans=Math.max(i-j+1,ans);
//         }
