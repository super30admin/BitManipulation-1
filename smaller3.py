# Time: O(n)
# Space: O(1)
# Did it run on Leetcode: yes

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        bitmask=0
        for num in nums:
            bitmask^=num
        lsb=bitmask & (-bitmask)
        bitmask2=0
        for num in nums:
            if((lsb & num)!=0):
                bitmask2^=num
        return [bitmask2, bitmask^bitmask2]