class Solution:
    # bitwise xor apporach
    # TC : O(n)
    # SC : O(1)
    def singleNumber(self, nums: List[int]) -> int:
        if nums is None :
            return -1
        xor = 0
        for num in nums:
            xor ^= num
        return xor
        
        