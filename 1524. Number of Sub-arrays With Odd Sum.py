# class Solution:
#     def numOfSubarrays(self, arr: List[int]) -> int:
#         MOD = 10**9+7
#         prefix_sum = 0
#         odd_count = 0
#         even_count = 1
#         result = 0
#         for num in arr:
#             prefix_sum += num
#             if prefix_sum % 2 != 0:
#                 result += even_count
#                 odd_count += 1 
#             else:
#                 result += odd_count
#                 even_count += 1  
#             result %= MOD
#         return result
class Solution:
    def numOfSubarrays(self, arr: List[int]) -> int:
        oddCount, prefixSum, mod = 0, 0, 1_000_000_007
        for a in arr:
            prefixSum += a
            oddCount += prefixSum % 2
        oddCount += (len(arr) - oddCount) * oddCount
        return oddCount % mod
