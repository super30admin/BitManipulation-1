# Time: O(n) 2n
# Space:O(1)
# Leetcode:Yes
# Issues:No


class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bm1 = 0                         # bitmask1
        for i in nums:
            bm1 = bm1 ^ i

        # least significant bit
        lsb = bm1 & -bm1                # bm1 & 2's Complement bm1
        # lsb = bm1 & (~bm1)+1        

        bm2 = 0                         # bitmask2
        for i in nums:
            if lsb & i != 0:            # if lsb & curr are not 0
                bm2 = bm2 ^ i           # bm2 will yeild 1 of the 2 og nos

        
        return [bm1 ^ bm2, bm2]         # re-xor bm2 with bm1 to find og no