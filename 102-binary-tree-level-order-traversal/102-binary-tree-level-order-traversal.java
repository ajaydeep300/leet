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
        List<List<Integer>> ret = new ArrayList<>(); // returnable list
        Queue<TreeNode> que = new LinkedList<>(); // queue (FIFO)
        que.add(root); // WE ADD ROOT
        if(root == null) return ret;
        while(!que.isEmpty()){
            List<Integer> ele = new ArrayList<>(); // create a list to be added inside a the main list
            int size = que.size();
            // loop until we finish the elements in the queue
            for(int i = 0; i < size; i++){
                TreeNode node = que.remove();
                ele.add(node.val); // add element
                if(node.left != null) // explore left and add to queue
                    que.add(node.left);
                if(node.right != null) // explore right and add to queue
                    que.add(node.right);

            }
            ret.add(new ArrayList<>(ele));
        }
        return ret;
    }
}