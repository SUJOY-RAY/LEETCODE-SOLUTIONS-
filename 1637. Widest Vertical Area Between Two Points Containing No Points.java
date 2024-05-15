class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int n=points.length;
        int [] xValues= new int [n];
        
        for(int i=0;i<n;i++){
          xValues[i]=points[i][0];  
        }
        Arrays.sort(xValues);
        
        int maxDiff=0;
        for(int i=1;i<n;i++){
            int diff=xValues[i]-xValues[i-1];
            maxDiff=Math.max(maxDiff,diff);
        }
                
        return maxDiff;
        
    }
}
