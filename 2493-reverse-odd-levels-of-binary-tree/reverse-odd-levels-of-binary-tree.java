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
    public TreeNode reverseOddLevels(TreeNode root) {
        solve(root.left,root.right,0);
        return root;
    }
    void solve(TreeNode root1,TreeNode root2,int c){
        if(root1==null || root2==null){
            return;
        }
        if(c%2==0 && root1!=null && root2!=null){
            int x=root1.val;
            root1.val=root2.val;
            root2.val=x;
        }
        solve(root1.left,root2.right,c+1);
        solve(root1.right,root2.left,c+1);
        // if(c%2==1 && root.left!=null && root.right!=null){
        //     int x=root.left.val;
        //     root.left.val=root.right.val;
        //     root.right.val=x;
        // }
    }
}