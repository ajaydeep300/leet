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
    public ListNode middleNode(ListNode head) {
        ListNode cur = head;
        int size = 0;
        while(cur != null){
            cur = cur.next;
            size++;
        }
        int half = (size % 2 == 0) ? ((size+1)/2) : (size/2);
        for(int i = 0; i < half; i++){
            head = head.next;
        }
        return head;
    }
}