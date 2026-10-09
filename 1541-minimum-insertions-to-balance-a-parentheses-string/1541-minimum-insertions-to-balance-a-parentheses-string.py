class Solution:
    def minInsertions(self, s: str) -> int:
        open=0
        close=0
        for c in s:
            if c=='(':
                open=open+2
                if open % 2 !=0:
                    close +=1
                    open -=1
            else:
                open=open-1
                if(open<0):
                    close=close+1
                    open=1
        return open+close
        