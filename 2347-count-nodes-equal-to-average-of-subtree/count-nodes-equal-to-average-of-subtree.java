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
    int ans=0;
    public int averageOfSubtree(TreeNode root) {
        solve(root);
        return ans;
    }
    int[] solve(TreeNode root){
        if(root==null) return new int[]{0,0};
        int x[]=solve(root.left);
        int y[]=solve(root.right);
        int sum=x[0]+y[0]+root.val;
        int cnt=x[1]+y[1]+1;
        if(sum/cnt==root.val){
            ans++;
        }
        return new int[]{sum,cnt};
    }
}