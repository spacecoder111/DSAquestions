class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int ans=0,j=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                int x=map.get(s.charAt(j));
                if(x==1){
                    map.remove(s.charAt(j));
                }else{
                    map.put(s.charAt(j),x-1);
                }
                j++;
            }
            ans=Math.max(ans,i-j+1);
        }
        return ans;
    }
}