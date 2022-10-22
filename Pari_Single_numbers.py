# Time complexity : O(2*n)
# Space complexity : O(1)
# Leetcode : Solved and submitted

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        # declare the default bitmask as 0
        bitmask = 0
        
        # find the xor of all number as the bitmask
        for num in nums:
            bitmask ^= num
        
        # do the 'AND' operation on bitmask and 2's complement of bitmask (-bitmask)
        diff = bitmask & (-bitmask)
        
        # declare a number x as 0, and traverse over the numbers again
        x = 0
        for num in nums:
            # if the 'AND' operation of number and the diff is not zero, then x xor num is one of the number
            if num & diff:
                x ^= num
        
        # 2nd number is found by doing xor of x on the original bitmask
        return [x, bitmask^x]
