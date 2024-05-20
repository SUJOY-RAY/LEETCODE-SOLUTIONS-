class Solution {
    public String interpret(String command) {
        StringBuilder sb=new StringBuilder();
        int index=0;
        while(index<command.length()){
            if( command.charAt(index)=='G'){
                sb.append("G");
                index++;
            }
            else if(command.charAt(index)=='(' &&command.charAt(index+1)==')'){
                sb.append("o");
                index+=2;
            }
            else {
                sb.append("al");
                index+=4;
            }
        }
        return sb.toString();
    }
}
