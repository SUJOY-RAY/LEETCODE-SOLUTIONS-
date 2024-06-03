class Solution:
    def maximumSum(self, arr: List[int]) -> int:
        result = currentSum = currentSumDel = arr[0]
        for n in arr[1:]:
            currentSumDel = max(currentSum, currentSumDel + n)  
            currentSum = max(n, currentSum + n) 
            result = max(result, currentSum, currentSumDel)  
        return result
