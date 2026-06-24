# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def removeElements(self, h, val):
        """
        :type head: Optional[ListNode]
        :type val: int
        :rtype: Optional[ListNode]
        """
        d=ListNode(0)
        d.next=h
        r=d
        while r and r.next:
            if r.next.val==val:
                r.next=r.next.next
            else:
                r=r.next
        return d.next
        