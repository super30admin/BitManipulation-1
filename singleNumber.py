class Solution:
    #O(n) solution using bit manipulation
    def singleNumber(self, nums: List[int]) -> int:
        bitMask = 0
        for num in nums:
            bitMask = bitMask^num
        return bitMask