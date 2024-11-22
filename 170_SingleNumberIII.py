'''
Accepted on leetcode(260)
time - O(N)
space - O(1)

'''


class Solution:
    def singleNumber(self, nums):
        xorValue = 0
        # step 1: Find the XOR value of 2 single numbers.
        for num in nums:
            xorValue = xorValue ^ num

        # step 2: Find the difference, xorValue and 2's complement.
        diff = xorValue & (-xorValue)

        # step 3: Find X(1st single number among 2)
        x = 0
        for num in nums:
            if diff & num != 0:
                x = x ^ num

        # step 4: Find second single number and return both numbers in a list
        return [x, x ^ xorValue]

