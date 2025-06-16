class Solution {
    public int maxDiff(int num) {
        int a = maximize(num);
        int b = minimize(num);

        return a - b;
    }

    private int maximize(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        char target = 0;
        for (char c : digits) {
            if (c != '9') {
                target = c;
                break;
            }
        }

        if (target == 0)
            return num;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == target) {
                digits[i] = '9';
            }
        }
        return Integer.parseInt(new String(digits));
    }

    private int minimize(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        char target = 0;
        char replacement = 0;

        if (digits[0] != '1') {
            target = digits[0];
            replacement = '1';
        } else {
            for (int i = 1; i < digits.length; i++) {
                if (digits[i] != '0' && digits[i] != '1') {
                    target = digits[i];
                    replacement = '0';
                    break;
                }
            }
        }

        if (target == 0)
            return num;

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == target) {
                digits[i] = replacement;
            }
        }
        return Integer.parseInt(new String(digits));
    }
}
