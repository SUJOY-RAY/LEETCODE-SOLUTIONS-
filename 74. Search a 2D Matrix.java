class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length, cols = matrix[0].length; 
        for(int i = 0; i < rows; i++) {
            if(Arrays.binarySearch(matrix[i], target) >= 0) {
                return true;
            }
        }
        return false;
    }
}
