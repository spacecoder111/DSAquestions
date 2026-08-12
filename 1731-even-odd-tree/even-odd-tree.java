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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int l=0;
        while(!q.isEmpty()){
            int s=q.size();
            int max=-1;
            if(l%2==1){
                max=Integer.MAX_VALUE;
            }
            for(int i=0;i<s;i++){
                TreeNode x=q.poll();
                if(l%2==1){
                    if(max<=x.val || x.val%2==1) return false;
                    max=x.val;
                }else{
                    if(max>=x.val || x.val%2==0) return false;
                    max=x.val;
                }
                if(x.left!=null) q.offer(x.left);
                if(x.right!=null) q.offer(x.right);
            }
            l++;
        }
        return true;
    }
}