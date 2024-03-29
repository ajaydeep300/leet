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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        
        ListNode new_head = new ListNode(0);
        ListNode iter = new_head;
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                iter.next = l1;
                l1 = l1.next;
            }
            else{
                iter.next = l2;
                l2 = l2.next;
            }
            iter = iter.next;
        }
        if(l1 == null) iter.next = l2;
        if(l2 == null) iter.next = l1;
        
        return new_head.next;
    } 
}