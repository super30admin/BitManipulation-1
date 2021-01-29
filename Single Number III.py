# Time:- O(n)
# Space:- O(1)

class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask=0
        for num in nums:
            bitmask^=num
        diff=bitmask & -bitmask
        bitmask2=0
        for num in nums:
            if (diff & num)!=0:
                bitmask2^=num
        return [bitmask2,bitmask2^bitmask]