class Solution {
    public int minSwaps(String s) {
        Stack<Character> st = new Stack<>();
        int counter = 0;
        for(char c:s.toCharArray()){
            if(c=='['){
                st.push(c);
            }else{
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    counter++;
                }
            }
        }
        return (counter+1)/2;
    }
}
