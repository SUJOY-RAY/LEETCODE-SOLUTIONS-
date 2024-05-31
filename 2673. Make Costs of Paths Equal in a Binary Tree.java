class Solution:
    def minIncrements(self, n: int, cost: List[int]) -> int:
        result=0
        sums=[0]*n//2
        for i in range(n-1,1,-2):
            left_sum, right_sum=cost[i-1],cost[i]
            if i<len(sums):
                left_sum+=sums[i-1]
                right_sum+=sums[i]
            sums[i//2-1]=max(left_sum, right_sum)
            result+=sums[i//2-1]-min(left_sum, right_sum)
        return result
