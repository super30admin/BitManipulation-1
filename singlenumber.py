# Time Complexity: O(n)
# Space Complexity: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        xor = 0

        for num in nums:
            xor = xor ^ num
        return xor