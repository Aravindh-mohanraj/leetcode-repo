class Solution(object):
    def findTheDifference(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: str
        """
        for ch in s:
            t=t.replace(ch,"",1)
        return t
