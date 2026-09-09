# Problem 2: Single number (https://leetcode.com/problems/single-number/)
# TC: O(n), single pass through nums
# SC: O(1), only one variable used, no extra data structure
# Approach: XOR every number together. a^a=0 and a^0=a, so all pairs cancel out to 0, leaving only the number that appears once.

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        result = 0                 # start with identity value for XOR
        for i in nums:
            result = result ^ i    # cancels out duplicates
        return result              # what remains is the single number
        