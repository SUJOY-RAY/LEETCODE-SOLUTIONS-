class Solution {

    public static int minimum(ArrayList<Integer> nums) {
        int min=nums.get(0);
        for(int i=1;i<nums.size();i++){
            if (nums.get(i)<min){
                min=nums.get(i);
            }
        }
        return min;
    }

    public int[] numberGame(int[] nums) {
        ArrayList<Integer>data=new ArrayList<>();
        ArrayList<Integer>result=new ArrayList<>();
        for (int a:nums){
            data.add(a);
        }
        while(!data.isEmpty()){
            int minAlice=minimum(data);
            data.remove(data.indexOf(minAlice));
            int minBob=minimum(data);
            data.remove(data.indexOf(minBob));

            result.add(minBob);
            result.add(minAlice);
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            resultArray[i] = result.get(i);
        }

        return resultArray;
    }
}
