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
    public List<Integer> inorderTraversal(TreeNode root) {
        if( root == null)
            return new ArrayList<>();
        // we start from the root node and then check the left side of the tree
        // after we are finished checking and pushing the left side nodes of the tree
        // we start adding the right nodes of the tree
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ret = new ArrayList<>();
        TreeNode loop = root;
        // loop until we reach null or the stack is empty
        while(loop != null || !st.isEmpty()){
            if(loop != null){
                st.push(loop);
                loop = loop.left;
                // push the left side nodes first
            }
            else{
                loop = st.pop();
                ret.add(loop.val);
                loop = loop.right;
                // push the right side of the nodes while poping the stack simultaneously
            }
        }
        return ret;
    }
}