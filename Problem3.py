# Problem 3
# Pair of  Single numbers

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask1 = 0
        bitmask2 = 0

        for num in nums:
            bitmask1 = bitmask1 ^ num

        LSB = bitmask1 & (-bitmask1)

        for num in nums:
            if LSB & num != 0:
                bitmask2 = bitmask2 ^ num

        return [bitmask2,bitmask2 ^ bitmask1]