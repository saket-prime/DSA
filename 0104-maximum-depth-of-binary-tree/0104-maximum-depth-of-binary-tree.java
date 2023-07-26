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
       Map<Integer, List<Integer>> listMap = new HashMap<>();
        Queue<List<TreeNode>> nodes = new ArrayDeque<>();
        int count = 0;

        if (root != null){
            List<TreeNode> list = List.of(root);
            listMap.put(count, new ArrayList<>());
            listMap.get(count).add(root.val);
            nodes.add(list);
        }
        while(!nodes.isEmpty()){
            count++;
            listMap.put(count, new ArrayList<>());
            List<TreeNode> first = nodes.poll();
            List<TreeNode> temp = new ArrayList<>();
            for (int i = 0; i < first.size(); i++){
                if (first.get(i).left  != null) {
                    temp.add(first.get(i).left);
                    listMap.get(count).add(first.get(i).left.val);
                }
                if (first.get(i).right  != null) {
                    temp.add(first.get(i).right);
                    listMap.get(count).add(first.get(i).right.val);
                }
            }
            if(!temp.isEmpty())nodes.add(temp);
            if(listMap.get(count).isEmpty()) listMap.remove(count);
            
        }

        return new ArrayList<>(listMap.values());
    }

    public int maxDepth(TreeNode root) {

      List<List<Integer>> depth = levelOrder(root);
      return depth.size();
        
    }
}