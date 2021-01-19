"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Take XOR of all the numbers. XOR pf a number with itself gives 0. So the number which occurs once will remain
"""


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for num in nums:
            bitmask ^= num
        return int(bitmask)
