"""
Take XOR of all the numbers. XOR of a number to itself is 0. this way get the single number 

TC=O(N)
SC=0(1)

"""

class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        bitmask = 0
        for num in nums:
            bitmask ^= num #^ XOR operator 
        return int(bitmask)

        