class Solution {
    public String reversePrefix(String word, char ch) {
        int a =word.indexOf(ch);

        StringBuilder sb=new StringBuilder();
        for(int i=a;i>=0;i++){
            sb.append(word.charAt(i));
        }
        for(int i=a+1;i<word.length();i++){
            sb.append(word.charAt(i));
        }
        return sb.toString();
    }
}
