class Solution {
    public String smallestPalindrome(String s) {
        int arr[]=new int[26];
        for(char ch:s.toCharArray()){
            arr[(int)(ch-'a')]++;
            
        }
        StringBuilder sb=new StringBuilder();
        String x="";
        for(int i=0;i<26;i++){
            if(arr[i]==0) continue;
            if(arr[i]%2==0){
                int y=arr[i]/2;
                while(y-- >0){
                  sb.append((char)(i+'a'));
                }
            }else{
                if(arr[i]>1){
                   int y=arr[i]/2;
                   while(y-- >0){
                   sb.append((char)(i+'a'));
                   }
                  x+=(char)(i+'a'); 
                }else{
                    x+=(char)(i+'a');
                }
            }
        }
         StringBuilder ans=new StringBuilder();
         ans.append(sb.toString());
         ans.append(x);
        ans.append(sb.reverse().toString());
        return ans.toString();
    }
}