class Solution {
    public int longestString(int x, int y, int z) {
        int result=0;
        if(x!=y){
            result=2*Math.min(x,y)+1+z;
        }
        else{
            result=2*Math.min(x,y)+z;
        }
        return result*2;
    }
}
