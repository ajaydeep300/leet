/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode top = new ListNode(0);
        ListNode slow = top, fast = top;
        slow.next = head;
        //Move fast in front so that the gap between slow and fast becomes n
        for(int i = 0; i<= n;i++){
            fast = fast.next;
        }
        // then move slow until fast becomes null, therefore slow will iterate till one node before the deletion node
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        // link the slow node with the next.next node
        slow.next = slow.next.next;
        return top.next;
    }
}