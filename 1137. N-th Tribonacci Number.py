class Solution:
    def tribonacci(self, n: int) -> int:
        tribo = [0, 1, 1]
        while len(tribo) <= n:
            tribo.append(tribo[-1] + tribo[-2] + tribo[-3])

        return tribo[n]
