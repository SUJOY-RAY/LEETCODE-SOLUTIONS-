class Solution {
    public int myAtoi(String s) {
        int i=0;
        //to move to the point where the blank spaces end
        while(i<s.length()&&s.charAt(i)==' '){
            i++;
        }

        //Checking the sign
        int sign=1;
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }

        //Read the characters until the end of the string
        int result=0;
        while(i<s.length()&&Character.isDigit(s.charAt(i))){
            int digit = Character.getNumericValue(s.charAt(i));

            //Digit to Integer
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        
        //Create the new result and return it
        return result*sign;                            
    }  
}
