class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> counter = new HashMap<>();
        int n=nums.length;
        int result=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int product=nums[i]*nums[j];
                counter.put(product, counter.getOrDefault(product, 0) + 1);
            }
        }
        for(int count:counter.values()){
            if (count > 1) {
                result += (count * (count - 1) / 2) * 8; 
            }

        }
        return result;
    }
}
