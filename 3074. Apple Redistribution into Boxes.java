class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int total = Arrays.stream(apple).sum();
        Arrays.sort(capacity);
        int j = 0;
        int counter = 0;
        for(int i = capacity.length - 1; i >= 0; i--) {
            if(counter >= total){
                return j;
            }
            counter += capacity[i];
            j++;
        }
        return j;
    }
}
