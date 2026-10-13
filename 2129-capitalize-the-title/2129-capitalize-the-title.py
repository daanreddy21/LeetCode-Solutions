class Solution:
    def capitalizeTitle(self, title: str) -> str:
        temp = title.lower().split(" ")
        for i in range(len(temp)):
            if len(temp[i]) > 2:
                temp[i] = temp[i].title()
        title1 = " ".join(temp)
        return title1