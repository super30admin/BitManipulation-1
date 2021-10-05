#Space:O(1)
#Time:O(n)
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0  
        for val in nums:
            bitmask^=val
        # return bitmask
        
        temp = bitmask & -bitmask
        
        x = 0
        for val in nums:
            if temp & val !=0:
                x ^= val
        return [x, bitmask^x]
        