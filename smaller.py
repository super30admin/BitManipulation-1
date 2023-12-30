# Time: O(n)
# Space: O(1)
# Did it run on Leetcode: yes

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        result=0
        for num in nums:
            result=result^num
        return result