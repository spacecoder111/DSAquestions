class Solution {
    public String smallestSubsequence(String s) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        Set<Character> set=new HashSet<>();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        Stack<Character>st=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.get(ch)-1);
            if(set.contains(ch)){
                continue;
            }
            while(!st.isEmpty() && map.get(st.peek())>0 && st.peek()>=ch){
               set.remove(st.pop());
            //    map.put(st.peek(),map.get(st.pop())-1);  
            }
            if(!set.contains(ch)){
                st.push(ch);
                set.add(ch);
            }
        }

        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}














// while(map.get(ch)>1){
            // if(!set.contains(ch)) sb.append(ch);
            // set.add(ch);
            // }