#Time Complexity: O(n)
#Space Complexity: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for num in nums:
            bitmask = bitmask ^ num
        return bitmask