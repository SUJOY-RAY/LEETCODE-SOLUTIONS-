class Solution:
    def countNegatives(self, grid: List[List[int]]) -> int:
        rows, columns=len(grid[0]),len(grid)
        row=0
        col=len(grid[0])-1
        counter=0

        while(row<rows and col>=0):
            if(grid[row][col]>=0):
                row+=1
            
            else:
                counter+=rows-row
                col-=1
        return counter
    
