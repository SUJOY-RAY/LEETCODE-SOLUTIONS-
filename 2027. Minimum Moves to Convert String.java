class Solution {
    public int minimumMoves(String s) {
        int minMoves = 0;
        int i=0;
        int n = s.length();
        while (i < n) {
            if(s.charAt(i)=='X'){
                minMoves++;
                i+=3;
            }else{
                i++;
            }
        }
        return minMoves;
    }
}
