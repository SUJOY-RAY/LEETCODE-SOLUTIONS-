class Solution {
    public boolean isPalindrome(String s) {
        ArrayList<Character> arr=new ArrayList<>();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                arr.add(Character.toLowerCase(c));
            }
        }

        int n=arr.size();
        for (int i=0;i<n/2;i++){
            if (!arr.get(i).equals(arr.get(n-i-1))){
                return false;
            }
        }
        return true;
    }
}
