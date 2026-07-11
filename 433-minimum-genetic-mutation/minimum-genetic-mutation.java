class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Set<String> set=new HashSet<>();
        for(String s:bank) set.add(s);
        if(!set.contains(endGene)) return -1;
        Queue<String> q=new LinkedList<>();
        int lev=0;
        q.add(startGene);
        while(!q.isEmpty()){
            int l=q.size();
            for(int i=0;i<l;i++){
            String d=q.poll();
            if(d.equals(endGene)) return lev;
            char x[]=d.toCharArray();
            for(int j=0;j<x.length;j++){
                char y=x[j];
                for(char k='A';k<='Z';k++){
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
        return -1;
    }
}