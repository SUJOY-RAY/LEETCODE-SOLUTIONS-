class Solution:
    @staticmethod

    def check(arr, k)->bool:
        for a in arr:
            if a<k:
                return True
        return False

    def minOperations(self, nums: List[int], k: int) -> int:
        counter=0
        while self.check(nums, k):
            minimum=min(nums)
            nums.remove(minimum)
            counter+=1
        return counter



        
