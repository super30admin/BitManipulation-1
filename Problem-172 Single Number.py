# 136. Single Number
# https://leetcode.com/problems/single-number/

# Logic: We take a running xor of all the numbers, all the 
# same numbers will become 0 and only the number with 1 
# occurance will remain.

# Time complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        res = 0
        
        for i in nums:
            res ^= i
        
        return res