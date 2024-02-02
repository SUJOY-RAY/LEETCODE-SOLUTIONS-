class Solution {
    public String longestCommonPrefix(String[] strs) {
        //return empty string in case of null input or string of length 0
        if(strs==null||strs.length==0){
            return "";
        }
        int minLen=Integer.MAX_VALUE;
        StringBuilder mystr=new StringBuilder();
        for(String str: strs){
            minLen=Math.min(minLen,str.length());
        }
        for(int i=0;i<minLen;i++){
            char currentChar=strs[0].charAt(i);
            for(int j=1;j<strs.length;j++){
                if(strs[j].charAt(i)!=currentChar){
                    return mystr.toString();
                }
            }
            mystr.append(currentChar);
        }
        return mystr.toString();
    }
}
