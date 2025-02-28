class Solution:
    def lenLongestFibSubseq(self, arr: List[int]) -> int:
        arr_map = {n: i for i, n in enumerate(arr)}
        n = len(arr)
        dp = [[2] * n for _ in range(n)]  
        res = 0

        for j in range(n):
            for i in range(j):
                prev, curr = arr[i], arr[j]
                nxt = prev + curr
                
                if nxt in arr_map and arr_map[nxt] > j:
                    k = arr_map[nxt]
                    dp[j][k] = dp[i][j] + 1
                    res = max(res, dp[j][k])

        return res if res >= 3 else 0 

# class Solution:
#     def lenLongestFibSubseq(self, arr: List[int]) -> int:
#         arr_set = set(arr)
#         res=0

#         for i in range(len(arr)-1):
#             for j in range(i+1, len(arr)):
#                 prev, curr = arr[i], arr[j]
#                 nxt = prev+curr
#                 length = 2
#                 while nxt in arr_set:
#                     length+=1
#                     prev, curr = curr, nxt
#                     nxt = prev + curr
#                     res = max(res, length)
#         return res
