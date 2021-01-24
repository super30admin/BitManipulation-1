#Time Complexity : O(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : Yes


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        num = 0
        for i in nums:
            num ^= i
        return num
