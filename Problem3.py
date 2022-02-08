# Time: O(n)
# Space: O(1)
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        bitmask1 = 0
        for i in nums:
            bitmask1 ^= i
        temp = bitmask1 & -bitmask1
        bitmask2 = 0
        for i in nums:
            if i & temp == 0:
                bitmask2 ^= i
        return [bitmask2, bitmask2^bitmask1]
        
        
