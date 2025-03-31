class Solution:
    # binary xor and binary and operations
    # TC : O(n)
    # SC : O(1)
    def singleNumber(self, nums: List[int]) -> List[int]:
        if nums is None:
            return []
        res = []
        xor,xor2 = 0,0
        for num in nums:
            xor ^= num
        temp = xor & (-xor) # 2's compliment for xor value
        for num in nums:
            if temp & num != 0:
                xor2  ^= num
        return [xor2,xor^xor2]
        