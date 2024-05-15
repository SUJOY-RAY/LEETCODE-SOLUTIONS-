class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result=new ArrayList<>();
        int maxCandies=Integer.MIN_VALUE;

        for(int i:candies){
            maxCandies=Math.max(maxCandies,i);
        }


        for(int j:candies){
            if(j+extraCandies>=maxCandies){
                result.add(true);
            }else{
            result.add(false);
            }
        }
        return result;
    }
}
