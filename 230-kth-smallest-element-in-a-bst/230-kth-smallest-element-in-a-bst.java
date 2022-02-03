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
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> s = new Stack<>();
        int count = k;
        while(root != null){
            s.push(root);
            root = root.left;
        }
        // we put the elements into a stack and we continue poping the last element until we find the k smallest value.
        // since we are using a binary search tree we put the root and its left child nodes into a stack and continue exploring the nodes by calling the .right nodes until we find the k th smallest element. 
        while(count != 0){
            TreeNode next = s.pop();
            count--;
            if(count == 0) return next.val;
            TreeNode r = next.right;
            while(r != null){
                s.push(r);
                r = r.left;
            }
        }
        return -1;
        
    }
}