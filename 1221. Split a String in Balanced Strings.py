class Solution:
    def balancedStringSplit(self, s: str) -> int:
        balance=0
        counter=0
        for a in s:
            if a=='L':
                balance+=1
            elif a=='R':
                balance-=1
            if balance==0:
                counter+=1
        return counter
