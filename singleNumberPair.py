# Time Complexity : O(n)
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
import functools
import operator
class Solution:
    def singleNumberPair(self, nums: List[int]) -> int:
        x_xor_y = functools.reduce(operator.xor, nums)
        bit =  x_xor_y & -x_xor_y
        res = [0, 0]
        for num in nums:
            res[bool(num & bit)] ^= num
        return res

if __name__ == '__main__':
    lis = [2, 1, 2, 3, 3, 4]
    print(Solution().singleNumberPair(lis))
