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

    public List<List<Integer>> levelOrder(TreeNode root) {
       List<List<Integer>> listMap = new ArrayList<>();
        Queue<TreeNode> nodes = new ArrayDeque<>();

        if (root != null){
            nodes.add(root);
        }
        while(!nodes.isEmpty()){
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++){
              TreeNode first = nodes.poll();
              list.add(first.val);
                if (first.left  != null) {
                    nodes.add(first.left);
                }
                if (first.right  != null) {
                    nodes.add(first.right);
                }
            }
            listMap.add(list);  
        }

        return listMap;
    }

    public int maxDepth(TreeNode root) {

      List<List<Integer>> depth = levelOrder(root);
      return depth.size();
        
    }
}