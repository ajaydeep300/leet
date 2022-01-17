/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
 /*       HashMap<Integer,Boolean> cycle = new HashMap<>();
        ListNode x = head;
        while(x != null){
            int y = x.val;
            if(cycle.get(y) == null)
                continue;
            else if(cycle.get(y) == true)
                return true;
            cycle.put(y, true);
            x = x.next;
        }
        return false; */
        ListNode one = head;
        ListNode two = head;
        while(two != null && two.next != null){
            one = one.next; // retrives next node one by one
            two = two.next.next; // retrives next node by twice
            if(one == two) // hence they will eventually match if there is a match
                return true;
        }
        return false; // if no match then return false
    }
}