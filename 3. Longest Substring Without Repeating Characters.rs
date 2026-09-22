use std::collections::HashMap;
impl Solution {
    pub fn length_of_longest_substring(s: String) -> i32 {
        let chars: Vec<char> = s.chars().collect();
        let mut map = HashMap::new();
        let mut left = 0;
        let mut ans = 0;

        for right in 0..chars.len() {
            if let Some(&index) = map.get(&chars[right]) {
                left = left.max(index + 1);
            }
            map.insert(chars[right], right);
            ans = ans.max(right - left + 1);
        }

        ans as i32
    }
}
