# Time Complexity: O(n)
# Space Complexity: O(1)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

class Solution(object):
    def find_single_numbers(nums):
        res = 0
        for num in nums:
            res ^= num
        rightmost_set_bit = (res and -res)
        group1 = 0
        group2 = 0
        for num in nums:
            if (num and rightmost_set_bit):
                group1 ^= num
            else:
                group2 ^= num
        return [group1, group2]