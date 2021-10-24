"""
Time Complexity : O(n) where n if length of nums
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
"""
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        if len(nums) == 0:
            return []
        xor = 0
        # We handle this via bit manipulation. We first do xor with each number and 
        # then we do 2's compliment. After that we find a second xor number who's
        # compliment with all the numbers is not zero, in that case we find new xor's
        # After that we return the xor1 and xor of xor1 and xor and return as new list
        for num in nums:
            xor = xor ^ num
        compliment = xor & (-xor)
        xor1 = 0
        for num in nums:
            if (compliment & num) != 0:
                xor1 = xor1 ^ num
        return [xor1, xor ^ xor1]