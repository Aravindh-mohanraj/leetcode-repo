# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, h):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        d=h
        r=h
        a=[]
        while h:
            a.append(h.val)
            h=h.next
        for i in a[::-1]:
            d.val=i
            d=d.next
        return r