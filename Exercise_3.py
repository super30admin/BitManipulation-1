# S30 Problem #176 Single Number III
#LeetCode #260. 

# Author : Akaash Trivedi
# time complexity: O(n)
# space complexity O(1)
# Did this code successfully run on Leetcode :  Yes #
# Any problem you faced while coding this : No

# bit manipulation
# XOR give us some of 2 missing number in list (x+y)
# numbers with 2s compliment give the 1st differing bit at LSB
# when & with all the number again we get a non zero value -> one of the missing number


class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        xor = 0
        for n in nums:
            xor ^= n
        # xor has x + y (two single numbers)

        # 2s compliment gives us negative bitmask(xor) [negative decimal]
        # when "&" number and 2s comp then we get least differing bit(first lsb thats diff from other num)
        ldb = xor & -xor

        xor2 = 0

        for n in nums:
            # one of the single number will produce none 0 when xor with least differing bit
            if (n & ldb) != 0:
                xor2 ^= n

        return [xor2, xor ^ xor2]