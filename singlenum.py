"""136. Single Number
TC - O(N)
SC - O(1)"""
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for num in nums:
            bitmask ^= num
        return bitmask
        