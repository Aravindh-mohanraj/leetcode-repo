# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def isPalindrome(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: bool
        """
        a=[]
        while head:
            a.append(head.val)
            head=head.next
        b=len(a)
        for i in range(b//2) :
            if a[i] != a[b-i-1]:
                return False
        return True
        