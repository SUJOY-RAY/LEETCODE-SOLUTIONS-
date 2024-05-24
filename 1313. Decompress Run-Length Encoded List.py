class Solution:
    def decompressRLElist(self, nums: List[int]) -> List[int]:
        n=len(nums)

        result=[]

        for i in range(0,n,2):

            result.extend(nums[i]*[nums[i+1]])
        
        return result
