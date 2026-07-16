class Solution {
    public int numberOfSubstrings(String s, int k) {
        int n=s.length();
        Map<Character,Integer> map=new HashMap<>();
        int count=0;
        int j=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            //int x=ma
            while(map.containsKey(ch) && map.get(ch)>=k){
                count+=n-i;
                char x=s.charAt(j);
                if(map.get(x)==1){
                    map.remove(x);
                }else{
                    map.put(x,map.get(x)-1);
                }
               j++;
            }
        }
        return count;
    }
}