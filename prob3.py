# Time Complexity : O(n)
# Space Complexity :O(1)
# Passed on Leetcode: yes

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xor_result = 0
        for num in nums:
            xor_result ^= num
        
        mask = 1
        while (xor_result & mask) == 0:
            mask <<= 1
        
        result1 = 0
        result2 = 0
        
        for num in nums:
            if (num & mask) == 0:
                result1 ^= num
            else:
                result2 ^= num
        
        return [result1, result2]
