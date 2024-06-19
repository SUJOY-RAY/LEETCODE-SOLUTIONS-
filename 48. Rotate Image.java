class Solution {
    public void reverse(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        
        }
    }

    public  void rotate(int[][] matrix) {
        for(int i=0;i<matrix[0].length;i++){
            for(int j=i;j<matrix[0].length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i=0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
    }
}
