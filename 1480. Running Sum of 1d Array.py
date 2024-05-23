class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        counter=0
        runningList=[]
        for i in range(len(nums)):
            counter+=nums[i]
            runningList.append(counter)
        return runningList
            
