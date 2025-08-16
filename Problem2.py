"""
Time Complexity: O(n)
Space Complexity: O(1)
"""
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask1 = 0
        for num in nums:
            bitmask1 ^= num

        diffBit = bitmask1 & -bitmask1
        bitmask2 = 0
        for num in nums:
            if (num & diffBit) != 0:
                bitmask2 ^= num
        return [bitmask2, bitmask1 ^ bitmask2]