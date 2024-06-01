class Solution:
    def checkRecord(self, s: str) -> bool:
        A=0
        
        for i in range(len(s)):
            if s[i]=='A':
                A+=1
            if i<=len(s)-3 and s[i:i+3]=='LLL':
                return False
        if A>=2:
            return False
        else:
            return True

