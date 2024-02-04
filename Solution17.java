import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer, List<String>> phno = new HashMap<>();
        phno.put(2, createList("a", "b", "c"));
        phno.put(3, createList("d", "e", "f"));
        phno.put(4, createList("g", "h", "i"));
        phno.put(5, createList("j", "k", "l"));
        phno.put(6, createList("m", "n", "o"));
        phno.put(7, createList("p", "q", "r", "s"));
        phno.put(8, createList("t", "u", "v"));
        phno.put(9, createList("w", "x", "y", "z"));

        char[] charArray = digits.toCharArray();
        List<String> result = new ArrayList<>();
        for (char c : charArray) {
            int key = Character.getNumericValue(c);
            List<String> letters = phno.get(key);
            result = combine(result, letters);
        }
        return result;
    }

    private List<String> combine(List<String> prevList, List<String> letters) {
        List<String> result = new ArrayList<>();
        if (prevList.isEmpty()) {
            return letters;
        }

        for (String prev : prevList) {
            for (String letter : letters) {
                result.add(prev + letter);
            }
        }

        return result;
    }

    private List<String> createList(String... elements) {
        return Arrays.asList(elements);
    }
}
