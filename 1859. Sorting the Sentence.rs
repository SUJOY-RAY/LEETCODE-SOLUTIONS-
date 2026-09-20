impl Solution {
    pub fn sort_sentence(s: String) -> String {
        let mut words = vec![String::new(); 9];

        for word in s.split_whitespace() {
            let pos = word.chars().last().unwrap().to_digit(10).unwrap() as usize;
            let text = &word[..word.len() - 1];

            words[pos - 1] = text.to_string();
        }

        words.into_iter()
        .filter(|word| !word.is_empty())
        .collect::<Vec<String>>()
        .join(" ")
    }
}
