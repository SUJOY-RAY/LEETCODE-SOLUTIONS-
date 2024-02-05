class Solution {
    public boolean isValid(String s) {
        char [] stack=new char[s.length()];
        int top=-1;
        for(char c:s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack[++top]=c;
            }
            else if(c==')' && top>=0 && stack[top]=='('){
                top--;
                
            }
            else if(c=='}' && top>=0 && stack[top]=='{' ){
                top--;
            }
            else if(c==']' && top>=0 && stack[top]=='['){
                top--;
            }
            else{
                return false;
            }
        }
        return top==-1;
        
    }
}
