class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        # Time O(n)
        # Space O(1)
        bitmask1 = 0
        for num in nums:
            bitmask1 ^= num
        
        temp = bitmask1 & (-bitmask1)
        bitmask2 = 0
        for num in nums:
            if (temp & num) != 0:
                bitmask2 ^= num
        
        return [bitmask2, bitmask1 ^ bitmask2]
