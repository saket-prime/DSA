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
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();

        if (root == null) return root;
        nodes.offer(root);
        while (!nodes.isEmpty()){
            int size = nodes.size();
            for (int i = 0; i< size; i++){
                TreeNode current = nodes.poll();
                TreeNode temp = current.left;
                current.left = current.right;
                current.right = temp;
                if (current.left!= null) nodes.offer(current.left);
                if (current.right != null) nodes.offer(current.right);
            }
        }
        return root;
    }
}