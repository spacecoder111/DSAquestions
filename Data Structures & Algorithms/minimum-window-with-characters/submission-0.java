class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(m>n) return "";
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<m;i++){
            map.put(ch2[i],map.getOrDefault(ch2[i],0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>(map);
        HashMap<Character,Integer> map3=new HashMap<>();
        String ans="";
        int l=n;
        int j=0;
        for(int i=0;i<n;i++){
            map3.put(ch1[i],map3.getOrDefault(ch1[i],0)+1);
            if(!map2.isEmpty() && map2.containsKey(ch1[i])){
                map2.put(ch1[i],map2.get(ch1[i])-1);
                if(map2.get(ch1[i])==0) map2.remove(ch1[i]);
            }
            if(map2.isEmpty() || map2==null){
                while(j<i && (!map.containsKey(ch1[j]) || (map.containsKey(ch1[j]) && map3.get(ch1[j])>map.get(ch1[j])))){
                    map3.put(ch1[j],map3.get(ch1[j])-1);
                   if(map3.get(ch1[j])==0) map3.remove(ch1[j]);
                   j++;
                }
                if(l>i-j){
                    ans="";
                    ans=s.substring(j,i+1);
                    l=ans.length();
                }
            }
        }
        return ans;
    }
}
