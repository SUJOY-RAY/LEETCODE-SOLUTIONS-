class Solution:
    def climbStairs(self, n: int) -> int:
        res = [1,2]
        if(n==1):
            return 1
        
        if(n==2):
            return 2
        
        if(n==3):
            return 3
        
        while len(res)<n:
            res.append(res[-1]+res[-2])
        
        return res[-1]
