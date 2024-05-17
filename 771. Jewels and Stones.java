class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> uniqueStones=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            uniqueStones.add(jewels.charAt(i));
        }

        int count=0;

        for(char a:uniqueStones){
            for(int j=0;j<stones.length();j++){
                if(a==stones.charAt(j)){
                    count++;
                }
            }
        }
        return count;
    }
}
