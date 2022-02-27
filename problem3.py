# Time Complexity : O(Log(n))
# Space Complexity:o(1)
#  Did this code successfully run on Leetcode : Yes

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        if nums is None or len(nums) == 0:
            return nums

        exOr = 0

        for num in nums:
            exOr = exOr ^ num

        final = exOr & -exOr

        exOr2 = 0

        for num in nums:
            if final & num != 0:
                exOr2 = exOr2 ^ num

        result = []
        result.append(exOr2)
        result.append(exOr2 ^ exOr)
        return result