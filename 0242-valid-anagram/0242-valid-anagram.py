from collections import Counter
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        map1=Counter(s)
        map2=Counter(t)
        return map1==map2
        