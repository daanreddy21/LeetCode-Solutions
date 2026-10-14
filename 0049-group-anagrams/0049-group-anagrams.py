class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        map={}
        for word in strs:
            templist=list(word)
            templist.sort()
            s=''.join(templist)
            if s not in map:
                arr=[]
                map[s]=arr
            group=map[s]
            group.append(word)
        return list(map.values())
        