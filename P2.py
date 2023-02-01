
## Problem 2
# Single number (https://leetcode.com/problems/single-number/)
# TC : O(n)
# SC :O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # if len(nums)==0:
        #     return 
        if len(nums)==1:
            return nums[-1]
        p = nums[0] ^ nums[1]
        if len(nums)<=2:
            return p
        for i in range(2, len(nums)):
            p = p ^ nums[i] 
        return p