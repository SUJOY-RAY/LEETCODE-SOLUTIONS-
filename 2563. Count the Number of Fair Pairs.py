class Solution:
    def countFairPairs(self, nums: List[int], lower: int, upper: int) -> int:
        nums.sort()
        count = 0
        n = len(nums)

        for i in range(n):
            left = lower - nums[i]
            right = upper - nums[i]

            l = bisect_left(nums, left, i+1)
            r = bisect_right(nums, right, i+1)
            
            count += r-l
        
        return count
