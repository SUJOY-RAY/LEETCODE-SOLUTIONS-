import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack("", 0, 0, n, result);
        return result;
    }

    private void backtrack(String s, int left, int right, int n, List<String> result) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }

        if (left < n) {
            backtrack(s + '(', left + 1, right, n, result);
        }
        if (right < left) {
            backtrack(s + ')', left, right + 1, n, result);
        }
    }
}
