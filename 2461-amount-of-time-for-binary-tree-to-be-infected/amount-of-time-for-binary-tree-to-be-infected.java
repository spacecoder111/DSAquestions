/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int amountOfTime(TreeNode root, int start) {
        Map<Integer,List<Integer>> graph=new HashMap<>();
        buildGraph(root,null,graph);
        Queue<Integer> q=new LinkedList<>();
        Set<Integer> set=new HashSet<>();
        q.add(start);
       // set.add(start);
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
                System.out.println(x);
                if(a.size()==0) continue;
                for(int y:a) {
                   System.out.println(y);
                   if(set.contains(y)) continue;
                    q.add(y);
                     vis=true;
                }
            }
            if(vis) level++;
        }
        return level;
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