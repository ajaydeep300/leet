/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode x = headA;
        ListNode y = headB;
        // 2 pointers^
        while(x!=y){
            x = (x == null) ? headB : x.next;
            y = (y == null) ? headA : y.next;
        }
        // loop until both the nodes are equal, if a node reaches the end then link it with the head of the other list.
        return x;
        // return node where it intersects, so return either x or y 
    }
}