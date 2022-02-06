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
        Stack<TreeNode> st = new Stack<>();
        List<Integer> ret = new ArrayList<>();
        TreeNode loop = root;
        while(loop != null || !st.isEmpty()){
            if(loop != null){
                st.push(loop);
                loop = loop.left;
            }
            else{
                loop = st.pop();
                ret.add(loop.val);
                loop = loop.right;
            }
        }
        return ret;
    }
}