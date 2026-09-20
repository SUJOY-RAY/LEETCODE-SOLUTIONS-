impl Solution {
    pub fn mem_leak(mut memory1: i32, mut memory2: i32) -> Vec<i32> {
        let mut i = 1;

        loop {
            if memory1 >= memory2 {
                if memory1 < i {
                    break;
                }

                memory1 -= i;
            } else {
                if memory2 < i {
                    break;
                }

                memory2 -= i;
            }

            i += 1;
        }

        vec![i, memory1, memory2]
    }
}
