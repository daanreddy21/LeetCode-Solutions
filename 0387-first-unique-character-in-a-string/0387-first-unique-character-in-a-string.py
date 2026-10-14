class Solution:
    def firstUniqChar(self, s: str) -> int:
        index=-1
        for i in range(0,len(s)):
            b=True
            for j in range(0,len(s)):
                if j != i and s[i]==s[j]:
                    b=False
                    break

            if b:
                index =i
                break
        return index        