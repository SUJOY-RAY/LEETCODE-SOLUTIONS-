class Solution {
    public int lengthOfLastWord(String s) {
        String myStr=s.trim();
        int count=0;
        for(int i=myStr.length()-1;i>=0;i--){
            if(!Character.isWhitespace(myStr.charAt(i))) {
                count++;
            }
            else{
            break;
            }
        }
        return count;
    }
}
