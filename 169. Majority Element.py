class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        majorityElement=nums[0]
        candidateVote=0
        size=len(nums)
        for a in nums:
            if a==majorityElement:
                candidateVote+=1
            else:
                candidateVote-=1
                if candidateVote==0:
                    candidateVote=1
                    majorityElement=a
        return majorityElement
