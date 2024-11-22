'''
Accepted on leetcode(136)
time - O(N)
space - O(1)
Approach:
XOR all elements in the array and finally return the xor which contains the single number as same numbers cancel out.
'''
class Solution:
    def singleNumber(self, nums) -> int:
        a = 0
        for i in nums:
            a ^= i
        return a