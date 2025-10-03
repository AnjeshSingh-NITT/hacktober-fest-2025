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
    int max;
    public int maxPathSum(TreeNode root) {
        max = Integer.MIN_VALUE;
        f(root);
        
        return max;
    }
    public int f(TreeNode node)
    {
        if(node == null) return 0;
        int l = Math.max(0,f(node.left));
        int r = Math.max(0,f(node.right));
        max = Math.max(max,l+r+node.val);
        return node.val + Math.max(l,r);
    }
}
