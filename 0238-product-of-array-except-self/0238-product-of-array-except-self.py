class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        arr = [1] * len(nums)
        prefix = 1

        for i in range(len(nums)):
            arr[i] = prefix
            prefix = prefix * nums[i]

        suffix = 1

        for i in range(len(nums)-1, -1, -1):
            arr[i] = suffix * arr[i]
            suffix = suffix * nums[i]

        return arr