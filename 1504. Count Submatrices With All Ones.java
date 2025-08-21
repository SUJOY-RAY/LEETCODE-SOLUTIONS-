class Solution {
    public int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int count = 0;

        for(int i=0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(mat[i][j]==1){
                    count+=dfs(mat, i, j);
                }
            }
        }
        return count;
    }
    int dfs(int [][] mat, int sR, int sC){
        int rows = mat.length;
        int columns = mat[0].length;

        int count = 0;
        int minWidth = Integer.MAX_VALUE;
        for(int i = sR;i<rows && mat[i][sC]==1;i++){
            int width = 0;
            for (int j = sC; j < columns && mat[i][j] == 1; j++) {
                width++;
            }

            minWidth = Math.min(minWidth, width);
            count+=minWidth;
        }
        return count;
    }
}
