class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        allowed_set=set(allowed)

        counter=0
        for word in words:
            if all(char in allowed_set for char in word):
                counter+=1
        return counter
