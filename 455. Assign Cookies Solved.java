class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int satisfy = 0;

        int i = g.length - 1;
        int j = s.length - 1;

        while(i >= 0 && j >= 0){
            if(g[i] <= s[j]){
                satisfy++;
                i--;
                j--;
            } else{
                i--;
            }
        }
        return satisfy;

    }
}
