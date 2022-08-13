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
    public boolean isPalindrome(ListNode head) {
        ListNode left = head;
        ArrayList<Integer> count = new ArrayList<>();
        while(left != null){
            count.add(left.val);
            left = left.next;
        }
        int start = 0;
        int end = count.size() - 1;
        while(start < end){
            if(!count.get(start).equals(count.get(end)))
                return false;
            start += 1;
            end -= 1;
        }
        return true;
    }
}