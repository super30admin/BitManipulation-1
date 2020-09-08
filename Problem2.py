"""
time : o(n)
space : o(1)
"""
class Solution(object):
    def singleNumber(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        x = 0
        
        for n in nums:
            x ^= n #XOR with the same number results in 0, so the numbers which are in pairs will make x = 0, the only number with no pair will remain as it is in the end 
            #print(x)
        return x