"""
time : o(n)
space : 0(1)
"""

class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        
        bitmask = 0
        
        for n in nums:
            bitmask ^= n #combination of two numbers
            
        diff = bitmask & (-bitmask) #bitwise & with 2's complement of mask
        bitmask2 = 0
        for n in nums:
            if n & diff != 0: #will give a random number for one of the single numbers
                bitmask2 ^= n
                
        return [bitmask2, bitmask ^ bitmask2] #basically, if we find one of the numbers and xor it with the combination we will get the next number
                
            