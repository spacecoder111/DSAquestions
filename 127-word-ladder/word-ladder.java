class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int u=beginWord.length();
        Set<String> set=new HashSet<>(wordList);
        if(!set.contains(endWord)) return 0;
        Queue<String> q=new LinkedList<>();
        int lev=1;
        set.add(beginWord);
        q.add(beginWord);
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
            String d=q.poll();
            if(d.equals(endWord)) return lev;
            char x[]=d.toCharArray();
            for(int j=0;j<u;j++){
                char y=x[j];
                for(char k='a';k<='z';k++){
                    if(y==k) continue;
                    x[j]=k;
                    String f=new String(x);
                    if(set.contains(f)){
                        q.add(f);
                        set.remove(f);
                    }
                }
                x[j]=y;
             }
          }
          lev++;
        }
        return 0;
    }
}

