class Solution:
    def nextGreaterElement(self, nums1: list[int], nums2: list[int]) -> list[int]:
        temp=[]
        for i in range (0,len(nums1)):
            temp.append(-1)
            for j in range(0,len(nums2)):
                if(nums1[i]==nums2[j]):
                    for k in range(j+1,len(nums2)):
                        if nums2[k]>nums2[j]:
                            temp[i]=nums2[k]
                            break
                    break
        return temp
       