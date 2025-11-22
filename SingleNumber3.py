# Time is O(n). To determine the 2 numbers which are just included one. We need kind a two equations. One is the current bitmask which we receive using the xor operation.
# The second equation is by finding the LSB(least significant bit) by taking twos complement and & with bitmask.
# Then doing an xor again will give the other number as we do & with the two earlier numbers that provided us with the bitmask, one will zero out.

# Space is O(1)

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask = bitmask ^ num

        # 2s complement
        lsb = bitmask & (~bitmask + 1)
        bitmask2 = 0
        for num in nums:
            if (num & lsb) != 0:
                bitmask2 = bitmask2 ^ num

        return [bitmask2, bitmask ^ bitmask2]

