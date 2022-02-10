# Time: O(n)
# Space: O(1)
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        ans = nums[0]
        for i in nums[1:]:
            ans ^= i
        return ans
        
