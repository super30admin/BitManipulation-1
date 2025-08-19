class Solution:
    def singleNumber(self,nums):
        bitmask1 = 0
        for num in nums:
            bitmask1 = bitmask1^num
        bitmask2 = 0
        lsb = bitmask1 & -bitmask1
        for x in nums:
            if (x&lsb)!=0:
                bitmask2 = bitmask2^x
        return [bitmask2, bitmask2^bitmask1]


a = Solution()
print(a.singleNumber([1,2,1,3,2,5]))
