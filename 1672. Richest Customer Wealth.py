class Solution:
    def maximumWealth(self, accounts: List[List[int]]) -> int:
        # row_length=len(accounts)
        # column_length=len(accounts[0])

        # row_sums=[]
        
        # for i in range(0,row_length):
        #     net_sum=0
        #     for j in range(0,column_length):
        #         net_sum+=accounts[i][j]
        #     row_sums.append(net_sum)   
        
        # return max(row_sums)             
        ls=[]
  
        for a in accounts:
            ls.append(sum(a))
        return max(ls)    
        
