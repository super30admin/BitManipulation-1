"""260. Single Number III
TC -O(N)
SC -O(1)"""
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask^=num
            
            #first bitmask would contain combination of both the missing number
            bitmask2 = 0
        diff = bitmask & (-bitmask)
            # now and the intermediate result with nums 
        for num in nums:
            if num & diff:
                bitmask2 ^=num
             #bitmask2 is going to give 1 of the missing number
        return [bitmask2,bitmask2^bitmask]
                    
       