class Solution:
    def findMin(self, nums: list[int]) -> int:
        for i in range(0,len(nums)-1):
            for j in range(0,len(nums)-1-i):
                if nums[j]>nums[j+1]:
                    nums[j],nums[j+1]=nums[j+1],nums[j]
        min_value = float('inf')
        for n in nums:
            if n< min_value:
                min_value=n
        return min_value
