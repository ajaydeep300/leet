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
    public ListNode mergeKLists(ListNode[] lists) {
        // we add all the elements into the priority queue
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(ListNode l : lists){
            while(l != null){
                q.add(l.val);
                l = l.next;
            }
        }
        if(q.size() == 0) return null;
        ListNode head = new ListNode(q.poll());
        ListNode curr = head;
        while(!q.isEmpty()){
            ListNode ne = new ListNode(q.poll());
            curr.next = ne;
            curr = ne;
        }
        return head; 
 }
}