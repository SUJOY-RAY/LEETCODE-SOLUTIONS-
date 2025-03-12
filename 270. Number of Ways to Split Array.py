class Solution:
    def waysToSplitArray(self, nums: List[int]) -> int:
        total = sum(nums[1:])
        count = 0
        curr = nums[0]
        if curr >= total:
            count += 1
        for i in range(1, len(nums) - 1):
            curr += nums[i]
            total -= nums[i]
            if curr >= total:
                count += 1
        return count
