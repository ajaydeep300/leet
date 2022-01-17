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
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>(); // stack for adding nodes
        LinkedList<Integer> ret = new LinkedList<>(); // arraylist for adding values
        if(root == null) return ret;
        stack.add(root); // add root node
        while(!stack.isEmpty()){ // loop until we dinish all the nodes
            TreeNode node = stack.pollLast(); // get the last element added
            ret.add(node.val);
            if(node.right != null) 
                stack.add(node.right);
            if(node.left != null)
                stack.add(node.left);
        }
        return ret;
    }
}