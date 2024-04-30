# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def helper(self, root):
        if root is None:
            return 0
        leftValue=self.helper(root.left)
        rightValue=self.helper(root.right)
        

        if leftValue==-1 or rightValue==-1:
            return -1
        if abs(leftValue-rightValue)>1:
            return -1
        
        return 1+max(leftValue, rightValue)



    def isBalanced(self, root: Optional[TreeNode]) -> bool:
        result=self.helper(root)
        if result!=-1:
            return True
        else:
            return False
