public class Solution {
    public string FractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) return "0";
        StringBuilder result = new StringBuilder();
        bool negative = (numerator < 0) ^ (denominator < 0);
        if (negative) result.Append("-");
        long num = Math.Abs((long)numerator);
        long den = Math.Abs((long)denominator);
        result.Append(num / den);

        long remainder = num % den;
        if (remainder == 0) return result.ToString();

        result.Append(".");
        Dictionary<long, int> remainderMap = new Dictionary<long, int>();

        while(remainder != 0){
            if (remainderMap.ContainsKey(remainder)) {
                result.Insert(remainderMap[remainder], "(");
                result.Append(")");
                break;
            }
            remainderMap[remainder] = result.Length;
            remainder *= 10;
            result.Append(remainder / den);
            remainder %= den;
        }
        return result.ToString();
    }
}
