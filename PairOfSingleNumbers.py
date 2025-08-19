class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask1 = 0
        for n in nums:
            bitmask1 = bitmask1 ^ n
        ldb = bitmask1 & -bitmask1 #least differing bit
        bitmask2 = 0
        for n in nums:
            if ldb & n == 0:
                bitmask2 = bitmask2 ^ n
        return [bitmask2, bitmask1 ^ bitmask2]
