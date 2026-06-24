class Solution(object):
    def maxNumberOfBalloons(self, text):
        d={'b':0,'a':0,'l':0,'o':0,'n':0}
        c=0
        for i in d.keys():
            d[i]=text.count(i)
        while True:
            if d['b']>=1 and d['a']>=1 and d['l']>=2 and d['o']>=2 and d['n']>=1 :
                c+=1
                d['b']-=1 
                d['a']-=1
                d['l']-=2 
                d['o']-=2
                d['n']-=1
            else :
                break
        return c

        