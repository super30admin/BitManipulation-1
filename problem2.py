# Time Complexity : O(n)
# Space Complexity:o(1)
#  Did this code successfully run on Leetcode : Yes


class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        if nums is None or len(nums) == 0:
            return 0

        exOr = 0

        for num in nums:
            exOr = exOr ^ num

        return exOr
