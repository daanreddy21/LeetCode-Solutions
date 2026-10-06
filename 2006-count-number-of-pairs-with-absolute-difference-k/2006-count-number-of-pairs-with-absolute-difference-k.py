class Solution:
    def countKDifference(self, nums: list[int], k: int) -> int:
        count =0
        for i in range(0, len(nums)):
            for j in range(0,len(nums)):
                if nums[i]-nums[j]==k:
                    count=count+1
        return count
        