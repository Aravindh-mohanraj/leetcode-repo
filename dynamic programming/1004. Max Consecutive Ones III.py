class Solution(object):
    def longestOnes(self, n, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: int
        """
        if n.count(0)<=k :
            return len(n)
        z=l=r=maxx=0
        for i in range (len(n)):
            if n[i]==0:
                z+=1
            if z<=k:
                maxx=max(maxx,r-l+1)
            else :
                while z>k:
                    if n[l]==0:
                        z-=1
                    l+=1
            
            r+=1
        return maxx

        