class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> counter = new HashMap<>();
        for (char a : s.toCharArray()) {
            counter.put(a, counter.getOrDefault(a, 0) + 1);
        }

        List<Character> chars = new ArrayList<>(counter.keySet());
        chars.sort((a, b) -> counter.get(b) - counter.get(a));
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(String.valueOf(c).repeat(counter.get(c)));
        }
        return result.toString();
    }
}
