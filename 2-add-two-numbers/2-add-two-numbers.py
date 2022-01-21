# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def addTwoNumbers(self, l1: Optional[ListNode], l2: Optional[ListNode]) -> Optional[ListNode]:
        head = None
        temp = None
        add = 0
        while l2 is not None or l1 is not None:
            s1 = add
            if l1 is not None:
                s1 += (l1.val)
                l1 = l1.next
            if l2 is not None:
                s1 += (l2.val)
                l2 = l2.next
            valu = s1 % 10
            new = ListNode(valu)
            add = s1 // 10
            if temp is None:
                temp = new 
                head = new
            else:
                temp.next = new
                temp = temp.next
        if add > 0:
            newNode = ListNode(add)
            temp.next = newNode
            temp = temp.next
        return head
                              
    def revers(self,li: ListNode):
        prev = None
        current = li
        while current is not None:
            new = current.next
            current.next = prev
            prev = current
            current = new
        li = prev
                                  
    def get_count(self):
        temp = self.head
        count = 0
        while temp:
            count += 1
            temp = temp.next
        return count  