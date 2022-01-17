/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        // assign the value of next node to the given node
            node.val = node.next.val;
            node.next = node.next.next;
        // link node to next.next node
    }
}