class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++){
            list.get(i).add(i);
        }
        int x=edges.length;
        for(int i=0;i<x;i++){
                int a=edges[i][0];
                int b=edges[i][1];
                list.get(a).add(b);
                list.get(b).add(a);
        }
        for(int i=0;i<n;i++){
            Collections.sort(list.get(i));
        }
        int c=0;
        boolean v[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(v[i]) continue;
            int a=list.get(i).size();
            List<Integer> l=list.get(i);
            boolean vis=false;
            for(int j=0;j<a;j++){
                if(l.get(j)==i) continue;
                int b=l.get(j);
                List<Integer> p=list.get(b);
                if(!(p.equals(l))){
                    vis=true;
                    break;
                }
            }
            if(!vis){
                c++;
                for(int k=0;k<a;k++){
                    v[l.get(k)]=true;
                }
            }
        }
        return c;
    }
}