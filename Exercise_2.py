# S30 Problem #175 Single Number
#LeetCode #136. https://leetcode.com/problems/single-number/description/

# Author : Akaash Trivedi
# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# bit manipulation
# Do XOR ^ with same number get 0 and XOR of different numbers 0 ^ 1 = 1
# if we do XOR of all numbers the repeated numbers will cancel themself. Only single number remains
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for n in nums:
            bitmask ^= n
        return bitmask