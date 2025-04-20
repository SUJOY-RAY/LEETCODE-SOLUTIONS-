class Solution:
    def numRabbits(self, answers: List[int]) -> int:
        freq = defaultdict(int)
        for num in answers:
            freq[num]+=1
        
        total = 0

        for a, count in freq.items():
            group_size = a + 1
            num_groups = (count+group_size-1) // group_size
            total += num_groups*group_size
        
        return total
