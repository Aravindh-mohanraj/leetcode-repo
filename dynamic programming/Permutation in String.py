class Solution(object):
    def checkInclusion(self, s1, s2):
        """
        :type s1: str
        :type s2: str
        :rtype: bool
        """
        if len(s1)>len(s2) :
            return False
        a=[0]*26
        b=[0]*26
        for i in s1:
            a[ord(i)-ord('a')]+=1
        k=len(s1)
        for i in range(k):
            b[ord(s2[i])-ord('a')]+=1
        for i in range(k,len(s2)):
            if a==b:
                return True
            b[ord(s2[i - k])-ord('a')]-=1
            b[ord(s2[i])-ord('a')]+=1
        if a==b:
            return True
        return False
            
        