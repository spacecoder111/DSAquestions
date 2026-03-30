class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int max=0;
        int j=0;
        Set<Character>set=new HashSet<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
                while(set.contains(ch)) {
                    set.remove(s.charAt(j));
                     j++;
               }
                 set.add(ch);
                 max=Math.max(max,i-j+1);
        }
        return max;
    }
}
