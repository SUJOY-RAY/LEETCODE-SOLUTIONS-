class Solution:
    def smallerNumbersThanCurrent(self, nums: List[int]) -> List[int]:
        sorted_nums = sorted(nums)
        num_map = {}
        for i,j in enumerate(sorted_nums):
            if j not in num_map:
                num_map[j]=i
        result=[num_map[num] for num in nums]

        return result
