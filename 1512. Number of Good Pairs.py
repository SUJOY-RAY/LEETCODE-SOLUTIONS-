class Solution:
    def numIdenticalPairs(self, nums: List[int]) -> int:
        count=0
        num_counts={}
        for a in nums:
            if a in num_counts:
                count+=num_counts[a]
                num_counts[a]+=1
            else:
                num_counts[a]=1
        return count
