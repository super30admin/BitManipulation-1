# Time complexity : O(n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        # make res as the first element from the nums list
        res = nums[0]
        
        # find the length of the nums list
        n = len(nums)
        
        # traverse over the list of nums and do xor operation of each numbers from the list
        for i in range(1,n):
            res ^= nums[i]
        
        # xor of the same number is 0, so we will only remain with the single number
        return res
