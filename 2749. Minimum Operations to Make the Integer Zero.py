class Solution:
    def makeTheIntegerZero(self, num1: int, num2: int) -> int:
        counter=0
        while bin(num1).count('1')>counter:
            counter+=1
            num1-=num2
            if num1<counter and num2>0:
                return -1
        return counter

