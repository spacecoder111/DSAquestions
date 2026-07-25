class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int n=words.length;
        if(n==1) return true;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<26;i++){
            char ch=order.charAt(i);
            map.put(ch,i);
        }
        for(int i=1;i<n;i++){
            String s=words[i-1];
            int m=s.length();
            String d=words[i];
            int p=d.length();
            int j=0;
            boolean vis=false;
            while(j<m && j<p){
                if(map.get(d.charAt(j))<map.get(s.charAt(j))){
                    return false;
                }else if(map.get(d.charAt(j))>map.get(s.charAt(j))){
                    vis=true;
                    break;
                }
                j++;
            }
            if(!vis && j<m) return false;
        }
        return true;
    }
}