# TC: O(n) 
# SC: O(1)

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        xor1 = 0
        for num in nums:
            xor1 = xor1 ^ num
        twosCompliment= xor1 & (-xor1)
        xor2= 0
        for num in nums:
            if twosCompliment & num !=0:
                xor2 = xor2 ^ num
        
        return [xor2, xor2 ^xor1]
