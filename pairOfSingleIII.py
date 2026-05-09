class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        bitmask = 0
        for num in nums:
            bitmask^=num
        
        ldb = bitmask & -bitmask
        a = b = 0
        for num in nums:
            if ldb & num:
                a^=num
            else:
                b^=num

        return [a,b]
