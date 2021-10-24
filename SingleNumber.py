"""
Time Complexity : O(n) where n if length of nums
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 0
        # We do logical xor of the numbers in the list. At the end the duplicate 
        # entries will cancel out in the xor calculation and only the unique entry
        # would be the our answer at the end.
        for num in nums:
            xor = xor ^ num
        return xor