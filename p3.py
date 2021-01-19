#time: O(N)
#Space: O(1)
class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        
        bitmask =0
        for n in nums:
            bitmask^=n
        
        diff = bitmask&(-bitmask)
        bitmask2 =0
        for n in nums:
            if diff & n !=0:
                bitmask2^=n
        
        return [bitmask2, bitmask2^bitmask]
