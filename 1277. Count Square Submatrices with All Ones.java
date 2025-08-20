class Solution {
    public int countSquares(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1) {
                    count+=dfs(matrix, i, j, count, m, n);
                }
            }
        }
        return count;
    }

    public int dfs(int [][] matrix, int i, int j, int count, int m, int n){
        int maxSize = Math.min(m - i, n - j);
        int size = 0;

        for(int k = 1;k<=maxSize;k++){
            if(isSquare(matrix, i, j, k)){
                size++;
            } else{
                break;
            }
        }
        return size;
    }

    private boolean isSquare(int[][] matrix, int i, int j, int len) {
        for (int x = i; x < i + len; x++) {
            for (int y = j; y < j + len; y++) {
                if (matrix[x][y] == 0)
                    return false;
            }
        }
        return true;
    }

}
