class Solution {
    public String longestCommonPrefix(String[] strs) {
        String p=strs[0];
        for(String s:strs){
            if(p.equals(s)){
                continue;
            }else{
                int i=0;
                while((i<p.length() && i<s.length()) && (p.charAt(i)==s.charAt(i))) i++;
                //p="";
                p=p.substring(0,i);
            }
        }
        return p;
    }
}