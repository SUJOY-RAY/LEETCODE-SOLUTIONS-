class Solution {
    public String removeOccurrences(String s, String part) {
        // StringBuilder sb = new StringBuilder();
        // for(char c: s.toCharArray()){
        //     sb.append(c);
        //     if(sb.length()>=part.length()){
        //         int start = sb.length()-part.length();
        //         if(sb.substring(start).equals(part)){
        //             sb.delete(start, sb.length());
        //         }
        //     }
        // }
        // return sb.toString();

        StringBuilder sb = new StringBuilder(s);
        while(sb.indexOf(part)!=-1){
            int start = sb.indexOf(part);
            sb.delete(start, start+part.length());
        }
        return sb.toString();
    }
}
