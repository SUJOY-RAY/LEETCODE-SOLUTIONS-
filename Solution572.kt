/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isSame(p: TreeNode?, q:TreeNode?):Boolean{
        if(p==null||q==null){
            return p==q
        }
        return p.`val`==q.`val`&& isSame(p.left,q.left)&&isSame(p.right,q.right)
    }


    fun isSubtree(root: TreeNode?, subRoot: TreeNode?): Boolean {
        if(root==null){
            return false
        }
        if(subRoot==null){
            return true
        }
        if(isSame(root,subRoot)){
            return true
        }
        return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot)
    }
}
