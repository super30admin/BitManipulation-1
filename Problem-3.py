# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Explanation:
# First XOR all numbers. Result = a ^ b where a and b are unique numbers.
# Find rightmost set bit of XOR result to distinguish the two numbers.
# Split numbers into two groups based on this bit.
# XOR each group to get the two unique numbers.

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        
        xor = 0
        for num in nums:
            xor ^= num
        
        diff = xor & -xor
        
        a = b = 0
        
        for num in nums:
            if num & diff:
                a ^= num
            else:
                b ^= num
        
        return [a, b]