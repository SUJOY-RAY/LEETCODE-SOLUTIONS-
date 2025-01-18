class Solution:
    def reverseWords(self, s: str) -> str:
        sList=s.split(" ")
        result=[]
        for a in sList:
            temp=a[::-1]
            result.append(temp)
        return " ".join(result)
