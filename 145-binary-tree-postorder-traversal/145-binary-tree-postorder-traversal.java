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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> ret = new LinkedList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return ret;
        st.push(root);
        while(!st.isEmpty()){
            TreeNode cur = st.pop();
            ret.addFirst(cur.val);
            if(cur.left != null){
                st.push(cur.left);
            }
            if(cur.right != null){
                st.push(cur.right);
            }
        }
        return ret;
    }
}