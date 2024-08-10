class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> countset=new HashSet<>();
        for(int a:nums){
            countset.add(a);
        }
        if(countset.size()==nums.length){
            return false;
        }else{
            return true;
        }

    }
}
