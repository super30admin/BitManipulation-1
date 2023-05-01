#All TC passed on leetcode

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        
        #Here we use XORing all nums and computing bitmask1. We compute temp by ANDing bitmask1 and its 2's complement. Now we AND temp with every num, if its non-zer then we XOR bitmask2 with every num. Finally result in bitmask2 holds one non-repeated number and XOR of bitmask2 and bitmask1 is another non-repeated number.
        #Time complexity - O(n)
        #Space complexity - O(1)
        bitmask1 = 0
        for n in nums:
            bitmask1 = bitmask1 ^ n

        temp = bitmask1 & -bitmask1
        bitmask2 = 0

        for n in nums:
            if temp & n != 0:
                bitmask2 = bitmask2 ^ n
        return [bitmask2, bitmask2^bitmask1]

    