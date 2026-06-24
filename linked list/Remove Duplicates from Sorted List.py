# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def deleteDuplicates(self, head):
        """
        :type head: Optional[ListNode]
        :rtype: Optional[ListNode]
        """
        d=ListNode(0)
        d.next=head
        p=d
        while head and head.next :
            if head.val==head.next.val :
                head.next=head.next.next
            else :
                head=head.next
        return head1