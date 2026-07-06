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
    public int rob(TreeNode root) {
        int dp[]=solve(root);
        return Math.max(dp[0],dp[1]);
    }
    int[] solve(TreeNode root){
         if(root==null) return new int[]{0,0};
         int a[]=solve(root.left);
         int b[]=solve(root.right);
         int take=root.val+a[1]+b[1];
         int skip=Math.max(a[1],a[0])+Math.max(b[1],b[0]);
         return new int[]{take,skip};
    }
}