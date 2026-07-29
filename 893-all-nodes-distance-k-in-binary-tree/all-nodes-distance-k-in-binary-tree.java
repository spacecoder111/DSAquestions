/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        Map<Integer,List<Integer>> graph=new HashMap<>();
        buildGraph(root,null,graph);
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        List<Integer> ans=new ArrayList<>();
        if(k==0){
            ans.add(target.val);
            return ans;
        }  
        q.add(target.val);
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            boolean vis=false;
            while(n-- >0){
                int x=q.poll();
                if(set.contains(x)){
                    continue;
                }
                set.add(x);
                List<Integer> a=graph.get(x);
                if(a.size()==0) continue;
                for(int y:a) {
                   if(set.contains(y)) continue;
                    q.add(y);
                     vis=true;
                }
            }
            if(vis) level++;
            if(level==k){
                for (Integer value:q) {
                   ans.add(value);
                }
                return ans;
            }
        }
        return ans;
    }
    void buildGraph(TreeNode root,TreeNode parent,Map<Integer,List<Integer>> graph){
        if(root==null) return;
        graph.putIfAbsent(root.val,new ArrayList<>());
        if(parent!=null){
          graph.get(root.val).add(parent.val);
          graph.get(parent.val).add(root.val);
        }
        buildGraph(root.left,root,graph);
        buildGraph(root.right,root,graph);
    }
}