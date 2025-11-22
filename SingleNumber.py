# Time is O(n) and space is O(1)

# The intuition here is to use the xor function, all the repeated numbers will cancel out. The single number will be remaining. 

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        for num in nums:
            result ^= num

        return result
