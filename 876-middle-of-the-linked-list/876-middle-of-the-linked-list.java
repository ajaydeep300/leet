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
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        // we calculate size then decide the half value
        int p = 0;
        p = ((size % 2) == 1 ? (size)/2 : (size+1)/2);
        int j = 0;
        while(j < p){
            head = head.next;
            j++;
        }
        // runtime O(n+n/2) = O(n)
        return head;
    }
}