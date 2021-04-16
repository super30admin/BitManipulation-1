#Time Complexity:O(n)
#Space Complexity:O(1)
#Approach: create a bitmask using the XOR function on each number in nums. Use bitmask and -bitmask to figure out the difference and calculate
#the second bitmask on numbers whose and with diff is 1. REturn both the bitmasks are the two single numbers 
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask ^= num
        diff = bitmask & (-bitmask)
        bitmask2 = 0
        for num in nums:
            if (diff & num):
                bitmask2 ^= num
        return [bitmask2, bitmask2 ^ bitmask]