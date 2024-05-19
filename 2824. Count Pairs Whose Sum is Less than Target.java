class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int n=nums.size();
        int counter=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if ((nums.get(i)+nums.get(j))<target){
                    counter++;
                }
            }
        }
        return counter;
    }
}
