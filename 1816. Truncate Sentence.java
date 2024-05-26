class Solution {
    public String truncateSentence(String s, int k) {
        int counter=0;
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' '){
            counter++;
                if(counter==k){
                    break;
                }

            }
            sb.append(s.charAt(i));           
        }
        return sb.toString();
    }
}
