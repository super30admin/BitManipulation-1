# Time Complexity : O(N)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Explanation:
# XOR has useful properties:
# a ^ a = 0
# a ^ 0 = a
# XOR of all numbers cancels duplicates and leaves the single number.

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0
        
        for num in nums:
            result ^= num
        
        return result