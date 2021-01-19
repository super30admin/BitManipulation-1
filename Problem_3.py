"""
Time Complexity : O(n) 
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

Firstly we create a bitmask (using XOR). This will give XOR of the numbers which appears only once because num (XOR) num = 0.
Then, we can find the rightmost significant bit from the mask since this bit will be unique to one number. We can use this to 
separate out one number from the other.
"""


class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask ^= num
        difference = bitmask & (-bitmask)
        bitmask2 = 0
        for num in nums:
            if (difference & num):
                bitmask2 ^= num
        return [int(bitmask2), int(bitmask2 ^ bitmask)]
