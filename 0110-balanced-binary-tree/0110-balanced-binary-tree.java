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
    public boolean isBalanced(TreeNode root) {
      
      int res = balanced(root);
      if (res == -1) return false;
      else return true;

    }

    public int balanced(TreeNode root) {
      if(root == null) return (0);
      int val1 = balanced(root.left);
      int val2 = balanced(root.right);

      if(val1 == -1 || val2 == -1 || val1 - val2 >= 2 || val2 - val1 >= 2) return -1;
      else return Math.max(val1, val2) + 1;

    }

}