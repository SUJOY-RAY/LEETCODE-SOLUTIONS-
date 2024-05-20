class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords=0;
        for(int i=0;i<sentences.length;i++){
            int counter=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' '){
                    counter++;
                }
            }
            maxWords=Math.max(maxWords, counter+1);
        }
        return maxWords;
    }
}
