#Time Complexity:O(n)
#Space Complexity:O(1)

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        xor=0
        for num in nums:
            xor=xor^num
        return xor
