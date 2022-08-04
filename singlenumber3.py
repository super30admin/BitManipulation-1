class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0 
        for el in nums:
            bitmask ^= el
        
        temp = bitmask & (-bitmask)
     
        bitmask2 = 0
        for el in nums:
            if el & temp != 0:
                bitmask2 ^= el
        return [bitmask2, bitmask^bitmask2]